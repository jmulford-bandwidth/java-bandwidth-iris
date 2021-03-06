# java-bandwidth-iris

Java Client library for IRIS / BBS API

## Installing

Bandwidth Java IRIS SDK uses Maven. The jars are available from a public Maven repository

Use the following dependency in your project:
```
<dependency>
  <groupId>com.bandwidth.sdk</groupId>
  <artifactId>bandwidth-java-iris-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

If you want to compile it yourself, here's how:
```bash
$ git clone git@github.com:bandwidthcom/java-bandwidth-iris.git
$ cd java-bandwidth-iris
$ mvn install
```

## Usage

Creating the client
```Java
IrisClient client = new IrisClient(accountId, username, password);

// You can then use the client to call a particular object's methods, e.g.
Site s = new Site();
Site returnSite = Site.create(client, s);

```

## Examples
There is an 'examples' folder in the source tree that shows how each of the API objects work with simple example code.
To run each of the examples, set them as run targets in your IDE, then set the following system environment variables:

```
export BANDWIDTH_IRIS_ACCOUNTID=<youraccountid>
export BANDWIDTH_IRIS_USERNAME=<yourusername>
export BANDWIDTH_IRIS_PASSWORD=<yourpassword>
export BANDWIDTH_IRIS_URL=https://api.inetwork.com //OR https://api.test.inetwork.com if you are working on test network
```


## API Objects 
### General principles
When fetching objects from the API, it will always return an object that has the client
instantiated so that you can call dependent methods as well as update, delete.

Example:
```Java
Site newSite = new Site();
newSite.setName("My New Site");

Site s = Site.create(client, newSite);
s.setName("Some Other Name");
s.update();
//then
s.delete();// etc
```

Each entity, where appropriate has a get, list, create, update and delete method

## Available Numbers
```
Map<String, Object> query = new HashMap<String, Object>();
query.put("areaCode", "205");
query.put("enableTNDetail", true);
query.put("quantity", 2);

List<TelephoneNumberDetail> numbers = (List<TelephoneNumberDetail>) AvailableNumbers.search(client, query);
for (TelephoneNumberDetail number : numbers)
{
    System.out.println(String.format("Full number: %s : Rate Center: %s", number.getFullNumber(), number.getRateCenter()));
}
```

## Available NpaNxx
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("areaCode", "805");
query.put("quantity", 2);
List<AvailableNpaNxx> availableNpaNxxList = AvailableNpaNxx.list(client, query);
for(AvailableNpaNxx npaNxx : availableNpaNxxList){
    System.out.println(
      String.format("City: %s | Npa: %s | Nxx: %s | State: %s ", npaNxx.getCity(), npaNxx.getNpa(),
              npaNxx.getNxx(), npaNxx.getState())
    );
}


```

## Cities
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("state", "NC");

List<City> cities = City.list(client, query);
for(City c : cities){
    System.out.println(String.format("Name: %s | RcAbbreviation: %s", c.getName(), c.getRcAbbreviation()));
}
```

## Covered Rate Centers
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("state", "NC");

List<CoveredRateCenter> rateCenters = CoveredRateCenter.list(client, query);
for(CoveredRateCenter rc : rateCenters){
    System.out.println(String.format("Name: %s | Abbreviation: %s | State: %s | Lata: %s", rc.getName(),
            rc.getAbbreviation(), rc.getState(), rc.getLata()));
}
```


## Disconnect Numbers 
The Disconnect object is used to disconnect numbers from an account.  Creates a disconnect order that can be tracked

### Create Disconnect
```Java
DisconnectTelephoneNumberOrder disco = new DisconnectTelephoneNumberOrder();
disco.setName("A test order");
disco.getDisconnectTelephoneNumberOrderType().getTelephoneNumberList().add("9195551212");

DisconnectTelephoneNumberOrderResponse response = DisconnectTelephoneNumberOrder.create(client, disco);
```

### Get Disconnect
```Java
DisconnectTelephoneNumberOrderResponse response = DisconnectTelephoneNumberOrder.get(client, "orderId");
```


## Dlda

### Create Ddla
```Java
DldaTnGroup dldaTnGroup = new DldaTnGroup();
dldaTnGroup.getTelephoneNumberList().add("9195551212");
dldaTnGroup.setAccountType("RESIDENTIAL");
dldaTnGroup.setListingType("LISTED");
DldaOrder order = new DldaOrder();
order.getDldaTnGroups().add(dldaTnGroup);

DldaOrder newOrder = DldaOrder.create(client, order);

```

### Get Dlda
```Java
DldaOrder order = DldaOrder.get(client, "orderId");
```

### List Dldas
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("telephoneNumber", "9195551212");

ResponseSelectWrapper wrapper = DldaOrder.list(client, query);
```
## In Service Numbers

### List InService Numbers
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("state", "NC");

TNs tns = InserviceNumber.list(getDefaultClient(), query);
```

## Lidb

### Create
```Java
LidbTnGroup group = new LidbTnGroup();
group.getTelephoneNumberList().add("9195551212");
LidbOrder order = new LidbOrder();
order.getLidbTnGroupList().add(group);
order = LidbOrder.create(client, order);
```
### Get Lidb
```Java
LidbOrder order = LidbOrder.get(client, "orderId");
```

## LNP Checker
### Check LNP
```Java
NumberPortabilityRequest request = new NumberPortabilityRequest();
request.getTnList().add("9195551212");
NumberPortabilityResponse response = LnpChecker.checkLnp(client, request, "true");
System.out.println(response.getPortableNumbers().get(0));
```

## Orders
### Create Order
```Java
Order o = new Order();
o.setName("A New Order");
ExistingTelephoneNumberOrderType existingTelephoneNumberOrderType = new ExistingTelephoneNumberOrderType();
existingTelephoneNumberOrderType.getTelephoneNumberList().add("2052865046");
o.setExistingTelephoneNumberOrderType(existingTelephoneNumberOrderType);

OrderResponse createdOrder = Order.create(client, o);
```
### Get Order
```Java
Order o = Order.get(client, "orderId");
```
### Order Instance Methods
```Javas
order.update();
order.delete();
order.getNotes()
order.addNote(Note n);
```

## Port Ins
### Create PortIn
```Java
LnpOrder order = new LnpOrder();
order.setSiteId(getFirstSite().getId());
order.setPeerId(getFirstSipPeer().getPeerId());
order.setBillingTelephoneNumber("9195551212");
Subscriber s = new Subscriber();
s.setSubscriberType("BUSINESS");
s.setBusinessName("Company");
ServiceAddress serviceAddress = new ServiceAddress();
serviceAddress.setHouseNumber("123");
serviceAddress.setStreetName("Anywhere St");
serviceAddress.setCity("Raleigh");
serviceAddress.setStateCode("NC");
serviceAddress.setZip("27609");
s.setServiceAddress(serviceAddress);
order.setSubscriber(s);
order.setLoaAuthorizingPerson("Joe Blow");
order.getListOfPhoneNumbers().add("9195551212");

order = LnpOrder.create(client, order);

```
## Get PortIn
```Javascript
LnpOrder order = LnpOrder.get(client, "orderId");
```

### PortIn Instance methods
```Java
order.update(client, LnpOrderSupp supp);
order.delete();
```
### PortIn File Management
```Java
order.uploadLoa(File file, LoaFileType type);
order.updateLoa(File file, LoaFileType type);
order.deleteLoa(String fileName);
order.getLoaMetaData(String fileName);
order.updateLoaMetaData(String fileName, FileMetaData metaData);
order.deleteLoaMetaData(String fileName);

```

## Rate Centers
### List Ratecenters
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("state", "NC");
query.put("available", true);

List<RateCenter> rateCenters = RateCenter.list(client,query);
for(RateCenter rc : rateCenters){
    System.out.println(String.format("Name: %s | Abbreviation: %s", rc.getName(), rc.getAbbreviation()));
}

```

## SIP Peers
### Create SIP Peer
```Java
Host host = new Host();
host.setHostName("new host");

TerminationHost termHost = new TerminationHost();
termHost.setHostName("term host");
termHost.setPort("5060");

SipPeer peer = new SipPeer();
peer.setPeerName("A new Sip Peer");
peer.setDefaultPeer(false);
peer.setShortMessagingProtocol("SMPP");
peer.setSiteId(getFirstSite().getId());

peer.getVoiceHosts().add(host);
peer.getSmsHosts().add(host);
peer.getTerminationHosts().add(termHost);

peer = SipPeer.create(client, getFirstSite().getId(), peer);

```
### Get SIP Peer
```Java
SipPeer peer = SipPeer.get(client, "peerId");
```
### List SIP Peers
```Java
List<SipPeer> peers = SipPeer.list(client, "siteId");
```
### Delete SIP Peer
```Java
SipPeer peer = SipPeer.get(client, "peerId");
peer.delete()
```
### SipPeer TN Methods
```Java
peer.updateTn(sipPeerTelephoneNumber);
peer.getTn("number");
peer.moveTns(sipPeerTelephoneNumbers);
```

## Sites

### Create A Site
A site is what is called Location in the web UI. 
```Java
Site s = new Site();
s.setName("My New Site");

s = Site.create(client, s);
```

### Updating a Site
```Java
Site s = Site.get(client, "siteId");
s.setName("New Name");
s.update();
```
### Deleting a Site
```Java
Site s = Site.get(client, "siteId");
s.delete();
```
### Listing All Sites
```Java
List<Site> sites = Site.list(client);

```

## Subscriptions
### Create Subscription
```Java
Subscription subscription = new Subscription();
subscription.setOrderType("orders");
subscription.setOrderId("orderId");
EmailSubscription emailSubscription = new EmailSubscription();
emailSubscription.setEmail("test@test.com");
emailSubscription.setDigestRequested("NONE");
subscription.setEmailSubscription(emailSubscription);
Subscription createdSubscription = Subscription.create(getDefaultClient(), subscription);
```
### Get Subscription
```Java
Subscription s = Subscription.get(client, "subscriptionId");
```
### List Subscriptions
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("orderType", "orders");

List<Subscription> subscriptions = Subscription.list(client, query);

```
### Subscription Instance Methods
```Java
subscription.update();
subcription.delete();
```

## TNs
### Get TN
```Java
TelephoneNumberDetail detail = Tns.getTnDetails(getClient(), "9195551212");
```
### List TNs
```Java
Map<String, Object> query = new HashMap<String, Object>();
query.put("state", "NC");

TelephoneNumbersResponse response = Tns.list(getClient(),query );
```

## TN Reservation
### Create TN Reservation
```Java
Reservation r = new Reservation();
r.getReservedTn().add("9195551212");
r = Reservation.create(client, r);

```
### Get TN Reservation
```Javas
Reservation r = Reservation.get(getDefaultClient(), "9195551212");

```
### Delete TN Reservation
```Java
Reservation r = Reservation.get(getDefaultClient(), "9195551212");
r.delete();

```