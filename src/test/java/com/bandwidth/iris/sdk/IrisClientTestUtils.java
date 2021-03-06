package com.bandwidth.iris.sdk;

public class IrisClientTestUtils {
    /**
     * Number search Xmls
     */
    public static String localAreaSearchResultXml = "<SearchResult><ResultCount>2</ResultCount><TelephoneNumberDetailList><TelephoneNumberDetail><City>JERSEY CITY</City><LATA>224</LATA><RateCenter>JERSEYCITY</RateCenter><State>NJ</State><TelephoneNumber>2012001555</TelephoneNumber></TelephoneNumberDetail><TelephoneNumberDetail><City>JERSEY CITY</City><LATA>224</LATA><RateCenter>JERSEYCITY</RateCenter><State>NJ</State><TelephoneNumber>123123123</TelephoneNumber></TelephoneNumberDetail></TelephoneNumberDetailList></SearchResult>";
    public static String availableNpaNxxSearchResultXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SearchResultForAvailableNpaNxx><AvailableNpaNxxList><AvailableNpaNxx><City>RALEIGH</City><Npa>919</Npa><Nxx>555</Nxx><Quantity>52</Quantity><State>NC</State></AvailableNpaNxx><AvailableNpaNxx><City>CARY</City><Npa>919</Npa><Nxx>556</Nxx><Quantity>168</Quantity><State>NC</State></AvailableNpaNxx></AvailableNpaNxxList></SearchResultForAvailableNpaNxx>";
    /**
     * Sites Xmls
     */
    public static String validSitesResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SitesResponse><Sites><Site><Id>2858</Id><Name>Test Site</Name><Description>A site description</Description></Site></Sites></SitesResponse>";
    public static String validSiteResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SiteResponse><Site><Id>2858</Id><Name>Test Site</Name><Description>A Site Description</Description><Address><HouseNumber>900</HouseNumber><StreetName>Main Campus Drive</StreetName><City>Raleigh</City><StateCode>NC</StateCode><Zip>27615</Zip><Country>United States</Country><AddressType>Service</AddressType></Address></Site></SiteResponse>";
    public static String invalidSiteDeleteResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SiteResponse><ResponseStatus><ErrorCode>12016</ErrorCode><Description>Site '5001' does not exist</Description></ResponseStatus></SiteResponse>";

    /**
     * Sip Peer Xmls
     */
    public static String validSipPeersResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TNSipPeersResponse><SipPeers><SipPeer xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"SipPeer\"><PeerId>12345</PeerId><PeerName>SIP Peer 1</PeerName><Description>Sip Peer 1 description</Description><IsDefaultPeer>true</IsDefaultPeer><ShortMessagingProtocol>SIP</ShortMessagingProtocol><VoiceHosts><Host><HostName>70.62.112.156</HostName></Host></VoiceHosts><VoiceHostGroups/><SmsHosts><Host><HostName>70.62.112.156</HostName></Host></SmsHosts><TerminationHosts><TerminationHost><HostName>70.62.112.156</HostName><Port>5060</Port><CustomerTrafficAllowed>DOMESTIC</CustomerTrafficAllowed><DataAllowed>true</DataAllowed></TerminationHost></TerminationHosts><CallingName><Display>true</Display><Enforced>false</Enforced></CallingName></SipPeer></SipPeers></TNSipPeersResponse>";
    public static String validSipPeerResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SipPeerResponse><SipPeer><PeerId>5678</PeerId><PeerName>SIP Peer 1</PeerName><Description>Sip Peer 1 description</Description><IsDefaultPeer>true</IsDefaultPeer><ShortMessagingProtocol>SIP</ShortMessagingProtocol><VoiceHosts/><VoiceHostGroups/><SmsHosts/><TerminationHosts/><CallingName><Display>true</Display><Enforced>false</Enforced></CallingName></SipPeer></SipPeerResponse>";
    public static String invalidIdSipPeerResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SipPeerResponse><ResponseStatus><ErrorCode>13563</ErrorCode><Description>Sip Peer '5555' account 'accountId' and site '1234' does not exist</Description></ResponseStatus></SipPeerResponse>";
    public static String validSipPeerTnResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SipPeerTelephoneNumberResponse><SipPeerTelephoneNumber><FullNumber>9195551212</FullNumber></SipPeerTelephoneNumber></SipPeerTelephoneNumberResponse>";
    public static String invalidSipPeerTnResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SipPeerTelephoneNumberResponse><ResponseStatus><ErrorCode>13536</ErrorCode><Description>Telephone number 9195551213 does not exist on Account accountId, Site 1234, and Sip Peer 5678</Description></ResponseStatus></SipPeerTelephoneNumberResponse>";
    public static String validSipPeerTnsResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SipPeerTelephoneNumbersResponse><SipPeerTelephoneNumbers><SipPeerTelephoneNumber><FullNumber>9195551212</FullNumber></SipPeerTelephoneNumber><SipPeerTelephoneNumber><FullNumber>9195551213</FullNumber></SipPeerTelephoneNumber></SipPeerTelephoneNumbers></SipPeerTelephoneNumbersResponse>";

    /**
     * Order Xmls
     */
    public static String validOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><OrderResponse><Order><Name>A New Order</Name><OrderCreateDate>2014-10-14T17:58:15.299Z</OrderCreateDate><BackOrderRequested>false</BackOrderRequested><id>someid</id><ExistingTelephoneNumberOrderType><TelephoneNumberList><TelephoneNumber>2052865046</TelephoneNumber></TelephoneNumberList></ExistingTelephoneNumberOrderType><PartialAllowed>false</PartialAllowed><SiteId>2858</SiteId></Order></OrderResponse>";
    public static String validOrderNotesResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Notes><Note><Id>178468</Id><UserId>user</UserId><Description>Adding a note</Description><LastDateModifier>2014-11-19T21:02:26.000Z</LastDateModifier></Note></Notes>";
    public static String validCreateDisconnectTelephoneNumberOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><DisconnectTelephoneNumberOrderResponse><orderRequest><Name>Disconnect</Name><OrderCreateDate>2014-10-17T15:02:46.077Z</OrderCreateDate><id>disconnectId</id><DisconnectTelephoneNumberOrderType><TelephoneNumberList><TelephoneNumber>2055551212</TelephoneNumber></TelephoneNumberList><DisconnectMode>normal</DisconnectMode></DisconnectTelephoneNumberOrderType></orderRequest></DisconnectTelephoneNumberOrderResponse>";
    public static String validCreateDisconnectTelephoneNumberOrderResponseWithErrorsXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><DisconnectTelephoneNumberOrderResponse><ErrorList><Error><Code>5006</Code><Description>The telephone number 2055551212 could not be disconnected since it is not associated with your account</Description><TelephoneNumber>2055551212</TelephoneNumber></Error></ErrorList><orderRequest><Name>Disconnect</Name><OrderCreateDate>2014-10-17T15:02:46.077Z</OrderCreateDate><id>disconnectId</id><DisconnectTelephoneNumberOrderType><TelephoneNumberList><TelephoneNumber>2055551212</TelephoneNumber></TelephoneNumberList><DisconnectMode>normal</DisconnectMode></DisconnectTelephoneNumberOrderType></orderRequest><OrderStatus>FAILED</OrderStatus></DisconnectTelephoneNumberOrderResponse>";

    /**
     * Reservation Xmls
     */

    public static String validReservationResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ReservationResponse><Reservation><ReservationId>1234</ReservationId><AccountId>accountId</AccountId><ReservationExpires>30</ReservationExpires><ReservedTn>9195551212</ReservedTn></Reservation></ReservationResponse>";
    public static String invalidReservationResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ReservationResponse><ResponseStatus><ErrorCode>5041</ErrorCode><Description>Reservation failed: telephone number 9195551212 is not available.</Description></ResponseStatus></ReservationResponse>";

    /**
     * Number Portability Xmls
     */

    public static String validNumberPortabilityResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><NumberPortabilityResponse><PortableNumbers><Tn>9195551212</Tn></PortableNumbers><SupportedRateCenters><RateCenterGroup><RateCenter>RALEIGH</RateCenter><City>RALEIGH</City><State>NC</State><LATA>426</LATA><Tiers><Tier>0</Tier></Tiers><TnList><Tn>9195551212</Tn></TnList></RateCenterGroup></SupportedRateCenters><UnsupportedRateCenters/><SupportedLosingCarriers><LosingCarrierTnList><LosingCarrierSPID>6214</LosingCarrierSPID><LosingCarrierName>Cingular</LosingCarrierName><TnList><Tn>9195551212</Tn></TnList></LosingCarrierTnList></SupportedLosingCarriers><UnsupportedLosingCarriers/></NumberPortabilityResponse>";
    public static String validNumberPortabilityResponseXmlWithErrors = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><NumberPortabilityResponse><Errors><Code>7201</Code><Description>Telephone number is invalid</Description><TelephoneNumbers><Tn>919</Tn></TelephoneNumbers></Errors></NumberPortabilityResponse>";

    /**
     * LnpOrder Xmls
     */

    public static String validLnpOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><LnpOrderResponse><OrderId>1234</OrderId><Status><Code>201</Code><Description>Order request received. Please use the order id to check the status of your order later.</Description></Status><ProcessingStatus>PENDING_DOCUMENTS</ProcessingStatus><LoaAuthorizingPerson>John Doe</LoaAuthorizingPerson><Subscriber><SubscriberType>BUSINESS</SubscriberType><BusinessName>Acme Corporation</BusinessName><ServiceAddress><HouseNumber>1623</HouseNumber><StreetName>Brockton Ave #1</StreetName><City>Los Angeles</City><StateCode>CA</StateCode><Zip>90025</Zip><Country>USA</Country></ServiceAddress></Subscriber><BillingTelephoneNumber>6882015002</BillingTelephoneNumber><ListOfPhoneNumbers><PhoneNumber>6882015025</PhoneNumber><PhoneNumber>6882015026</PhoneNumber></ListOfPhoneNumbers><Triggered>false</Triggered><BillingType>PORTIN</BillingType></LnpOrderResponse>";
    public static String validLnpSuppOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><LnpOrderResponse><OrderId>1234</OrderId><Status><Code>201</Code><Description>Order request received. Please use the order id to check the status of your order later.</Description></Status><ProcessingStatus>REQUESTED_SUPP</ProcessingStatus><LoaAuthorizingPerson>Jane Doe</LoaAuthorizingPerson><Subscriber><SubscriberType>BUSINESS</SubscriberType><BusinessName>Acme Corporation</BusinessName><ServiceAddress><HouseNumber>1623</HouseNumber><StreetName>Brockton Ave #1</StreetName><City>Los Angeles</City><StateCode>CA</StateCode><Zip>90025</Zip><Country>USA</Country></ServiceAddress></Subscriber><BillingTelephoneNumber>6882015002</BillingTelephoneNumber><ListOfPhoneNumbers><PhoneNumber>6882015025</PhoneNumber><PhoneNumber>6882015026</PhoneNumber></ListOfPhoneNumbers><Triggered>false</Triggered><BillingType>PORTIN</BillingType></LnpOrderResponse>";
    public static String validFileMetaDataResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><FileMetaData><DocumentName>file.pdf</DocumentName><DocumentType>PDF</DocumentType></FileMetaData>";
    public static String validActivationStatusResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <ActivationStatusResponse><ActivationStatus> <AutoActivationDate>2014-10-20T23:30:00Z</AutoActivationDate> <ActivatedTelephoneNumbersList><TelephoneNumber>9199918388</TelephoneNumber> </ActivatedTelephoneNumbersList> <NotYetActivatedTelephoneNumbersList/></ActivationStatus> </ActivationStatusResponse>";

    /**
     * Subscription Xmls
     */

    public static String validSubscriptionsResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SubscriptionsResponse><Subscriptions><Subscription><SubscriptionId>subscriptionId</SubscriptionId><OrderType>orders</OrderType><OrderId>someid</OrderId><EmailSubscription><Email>test@test.com</Email><DigestRequested>NONE</DigestRequested></EmailSubscription></Subscription></Subscriptions></SubscriptionsResponse>";

    /**
     * Cities Xmls
     */

    public static String validCitiesReponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><CityResponse><ResultCount>2</ResultCount><Cities><City><RcAbbreviation>PINEHURST</RcAbbreviation><Name>ABERDEEN</Name></City><City><RcAbbreviation>WINSTN SAL</RcAbbreviation><Name>ADVANCE</Name></City></Cities></CityResponse>";

    /**
     * RateCenters Xmls
     */

    public static String validRateCentersResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><RateCenterResponse><ResultCount>2</ResultCount><RateCenters><RateCenter><Abbreviation>ACME</Abbreviation><Name>ACME</Name></RateCenter><RateCenter><Abbreviation>AHOSKIE</Abbreviation><Name>AHOSKIE</Name></RateCenter></RateCenters></RateCenterResponse>";

    /**
     * Tns Xmls
     */

    public static String validTnDetailsResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TelephoneNumberResponse><TelephoneNumberDetails><City>MOUNT OLIVE</City><Lata>426</Lata><State>NC</State><FullNumber>9195551212</FullNumber><Tier>0</Tier><VendorId>49</VendorId><VendorName>Bandwidth CLEC</VendorName><RateCenter>MOUNTOLIVE</RateCenter><Status>Inservice</Status><AccountId>9900096</AccountId><LastModified>2014-10-14T20:01:53.000Z</LastModified></TelephoneNumberDetails></TelephoneNumberResponse>";
    public static String validTnRateCenterResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TelephoneNumberResponse><TelephoneNumberDetails><State>NC</State><RateCenter>MOUNTOLIVE</RateCenter></TelephoneNumberDetails></TelephoneNumberResponse>";
    public static String validTnLataResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TelephoneNumberResponse><TelephoneNumberDetails><Lata>426</Lata></TelephoneNumberDetails></TelephoneNumberResponse>";
    public static String validTnSiteResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Site><Id>2858</Id><Name>Test Site</Name></Site>";
    public static String validTnSipPeerResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><SipPeer><Id>507567</Id><Name>SIP Peer 1</Name></SipPeer>";
    public static String validTnListResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TelephoneNumbersResponse><TelephoneNumberCount>2</TelephoneNumberCount><Links><first>Link=&lt;https://api.test.inetwork.com:443/v1.0/tns?state=NC&amp;size=500&amp;page=1&gt;;rel=\"first\";</first></Links><TelephoneNumbers><TelephoneNumber><City>RALEIGH</City><Lata>426</Lata><State>NC</State><FullNumber>9193491234</FullNumber><Tier>0</Tier><VendorId>49</VendorId><VendorName>Bandwidth CLEC</VendorName><RateCenter>RALEIGH   </RateCenter><Status>PortInPendingFoc</Status><AccountId>9500249</AccountId><LastModified>2015-06-03T15:06:35.000Z</LastModified></TelephoneNumber><TelephoneNumber><City>RALEIGH</City><Lata>426</Lata><State>NC</State><FullNumber>9193499473</FullNumber><Tier>0</Tier><VendorId>49</VendorId><VendorName>Bandwidth CLEC</VendorName><RateCenter>RALEIGH   </RateCenter><Status>PortInPendingFoc</Status><AccountId>9500249</AccountId><LastModified>2015-06-03T14:59:20.000Z</LastModified></TelephoneNumber></TelephoneNumbers></TelephoneNumbersResponse>";

    /**
     * Covered RateCenters Xmls
     */

    public static String validCoveredRateCentersResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <CoveredRateCenters><TotalCount>18</TotalCount><Links><first></first><next>Link=&lt;https://api.inetwork.com:443/v1.0/coveredRateCenters?npa=310&amp;size=10&amp;e mbed=Cities&amp;embed=ZipCodes&amp;embed=NpaNxxX&amp; page=5&gt;;rel=\"next\";</next></Links> <CoveredRateCenter><Name>AVALON</Name><Abbreviation>AVALON</Abbreviation> <State>CA</State><Lata>730</Lata> <AvailableNumberCount>1</AvailableNumberCount> <ZipCodes><ZipCode>90731</ZipCode> </ZipCodes><Cities><City>SAN PEDRO</City> </Cities><Tiers> <Tier>0</Tier></Tiers> <NpaNxxXs><NpaNxxX>3105100</NpaNxxX> <NpaNxxX>3105101</NpaNxxX> <NpaNxxX>3109498</NpaNxxX> <NpaNxxX>3109499</NpaNxxX> <NpaNxxX>4242260</NpaNxxX></NpaNxxXs><Id>1</Id> </CoveredRateCenter><CoveredRateCenter><Name>AVALON</Name><Abbreviation>AVALON</Abbreviation> <State>CA</State><Lata>730</Lata> <AvailableNumberCount>1</AvailableNumberCount> <ZipCodes><ZipCode>90731</ZipCode> </ZipCodes><Cities><City>SAN PEDRO</City> </Cities><Tiers> <Tier>0</Tier></Tiers> <NpaNxxXs><NpaNxxX>3105100</NpaNxxX> <NpaNxxX>3105101</NpaNxxX> <NpaNxxX>3109498</NpaNxxX> <NpaNxxX>3109499</NpaNxxX> <NpaNxxX>4242260</NpaNxxX></NpaNxxXs><Id>1</Id> </CoveredRateCenter></CoveredRateCenters>";

    /**
     * Line Option Order Xmls
     */

    public static String validLineOptionOrderRequestXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <LineOptionOrder><TnLineOptions> <TelephoneNumber>5209072451</TelephoneNumber> <CallingNameDisplay>off</CallingNameDisplay></TnLineOptions> <TnLineOptions><TelephoneNumber>5209072452</TelephoneNumber><CallingNameDisplay>on</CallingNameDisplay> </TnLineOptions><TnLineOptions><TelephoneNumber>2013223685</TelephoneNumber><CallingNameDisplay>on</CallingNameDisplay> </TnLineOptions></LineOptionOrder>";
    public static String validLineOptionOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <LineOptionOrderResponse><LineOptions> <CompletedNumbers><TelephoneNumber>2013223685</TelephoneNumber> </CompletedNumbers><Errors><Error><TelephoneNumber>5209072452</TelephoneNumber> <ErrorCode>5071</ErrorCode><Description>Telephone number is not available on the system.</Description></Error> <Error><TelephoneNumber>5209072451</TelephoneNumber> <ErrorCode>13518</ErrorCode><Description>CNAM for telephone number is applied at the Location level and it is not applicable at the TN level.</Description> </Error></Errors> </LineOptions></LineOptionOrderResponse>";

    /**
     * Lidb Order Xmls
     */

    public static String validLidbOrderRequestXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <LidbOrder><LidbTnGroups> <LidbTnGroup><TelephoneNumbers> <TelephoneNumber>4352154856</TelephoneNumber></TelephoneNumbers> <SubscriberInformation>Steve</SubscriberInformation> <UseType>RESIDENTIAL</UseType> <Visibility>PUBLIC</Visibility></LidbTnGroup> <LidbTnGroup><TelephoneNumbers><TelephoneNumber>4352154855</TelephoneNumber> </TelephoneNumbers> <SubscriberInformation>Steve</SubscriberInformation> <UseType>RESIDENTIAL</UseType> <Visibility>PUBLIC</Visibility></LidbTnGroup> </LidbTnGroups></LidbOrder>";
    public static String validLidbOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <LidbOrderResponse><LidbOrder><id>2dda315b-e669-459b-940c-a76760d60906</id> <OrderCreateDate>2014-07-13T17:48:10.043Z</OrderCreateDate> <AccountId>12346099</AccountId> <CreatedByUser>jbm</CreatedByUser> <OrderId>2dda315b-e669-459b-940c-a76760d60906</OrderId> <LastModifiedDate>2014-07-13T17:48:10.043Z</LastModifiedDate> <ProcessingStatus>RECEIVED</ProcessingStatus><ErrorList/><LidbTnGroups><LidbTnGroup><TelephoneNumbers> <TelephoneNumber>4352169755</TelephoneNumber></TelephoneNumbers> <SubscriberInformation>Steve</SubscriberInformation> <UseType>RESIDENTIAL</UseType> <Visibility>PUBLIC</Visibility></LidbTnGroup> <LidbTnGroup><TelephoneNumbers> <TelephoneNumber>4352721843</TelephoneNumber></TelephoneNumbers> <SubscriberInformation>Steve</SubscriberInformation> <UseType>RESIDENTIAL</UseType> <Visibility>PUBLIC</Visibility></LidbTnGroup> </LidbTnGroups></LidbOrder> </LidbOrderResponse>";

    /**
     * Dlda Order Xmls
     */

    public static String validDldaOrderRequestXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><DldaOrder> <CustomerOrderId>[String]</CustomerOrderId> <DLDATnGroups><DLDATnGroup> <TelephoneNumbers><TelephoneNumber>5202217754</TelephoneNumber> </TelephoneNumbers> <AccountType>RESIDENTIAL</AccountType> <ListingType>LISTED</ListingType><ListingName> <FirstName>John</FirstName> <FirstName2/> <LastName>Smith</LastName><Designation/> <TitleOfLineage/> <TitleOfAddress/> <TitleOfAddress2/> <TitleOfLineageName2/> <TitleOfAddressName2/> <TitleOfAddress2Name2/> <PlaceListingAs/></ListingName> <ListAddress>true</ListAddress> <Address><HousePrefix/> <HouseNumber>915</HouseNumber> <HouseSuffix/><PreDirectional/> <StreetName>Elm</StreetName> <StreetSuffix>Ave</StreetSuffix> <PostDirectional/><AddressLine2/> <City>Carpinteria</City> <StateCode>CA</StateCode> <Zip>93013</Zip><PlusFour/><County/> <AddressType>DLDA</AddressType></Address> </DLDATnGroup></DLDATnGroups> </DldaOrder>";
    public static String validDldaOrderResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?> <DldaOrderResponse><DldaOrder><CustomerOrderId>[String]</CustomerOrderId> <OrderCreateDate>2014-07-16T07:59:08.065Z</OrderCreateDate> <AccountId>14</AccountId> <CreatedByUser>team_ua</CreatedByUser> <OrderId>f2ac3343-5bff-424a-b8ca-975f5e7b159e</OrderId> <LastModifiedDate>2014-07-16T07:59:08.065Z</LastModifiedDate> <ErrorList/><ProcessingStatus>RECEIVED</ProcessingStatus> <DldaTnGroups><DldaTnGroup><TelephoneNumbers> <TelephoneNumber>5202217754</TelephoneNumber></TelephoneNumbers> <AccountType>RESIDENCE</AccountType> <ListingType>LISTED</ListingType> <ListingName><FirstName>John</FirstName> <FirstName2></FirstName2> <LastName>Smith</LastName> <Designation></Designation> <TitleOfLineage></TitleOfLineage> <TitleOfAddress></TitleOfAddress> <TitleOfAddress2></TitleOfAddress2> <TitleOfLineageName2></TitleOfLineageName2> <TitleOfAddressName2></TitleOfAddressName2> <TitleOfAddress2Name2></TitleOfAddress2Name2> <PlaceListingAs></PlaceListingAs></ListingName> <ListAddress>true</ListAddress> <Address><HousePrefix></HousePrefix> <HouseNumber>915</HouseNumber> <HouseSuffix></HouseSuffix> <PreDirectional></PreDirectional> <StreetName>Elm</StreetName> <StreetSuffix>Ave</StreetSuffix> <PostDirectional></PostDirectional><AddressLine2></AddressLine2> <City>Carpinteria</City> <StateCode>CA</StateCode> <Zip>93013</Zip> <PlusFour></PlusFour> <County></County> <Country>United States</Country> <AddressType>Dlda</AddressType></Address> </DldaTnGroup>￼</DldaTnGroups> </DldaOrder></DldaOrderResponse>";

    /**
     * Inservice Tns Xmls
     */

    public static String validInserviceTnsResponseXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><TNs><TotalCount>59</TotalCount><Links><first> ( a link goes here ) </first></Links><TelephoneNumbers><Count>59</Count><TelephoneNumber>9195551212</TelephoneNumber></TelephoneNumbers></TNs>";
}
