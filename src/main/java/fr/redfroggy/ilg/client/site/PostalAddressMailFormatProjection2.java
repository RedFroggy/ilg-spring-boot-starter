package fr.redfroggy.ilg.client.site;

public interface PostalAddressMailFormatProjection2 {
 /**
  * Line 1 Mail formatted AFNOR NF Z 10-011 (Name)
  * @return addressL1
  */
 String getAddressL1();

 /**
  * Line 2 Mail formatted AFNOR NF Z 10-011 (Name complement)
  * @return addressL2
  */
 String getAddressL2();

 /**
  * Line 3 Mail formatted AFNOR NF Z 10-011 (Address Complement)
  * @return addressL3
  */
 String getAddressL3();

 /**
  * Line 4 Mail formatted AFNOR NF Z 10-011 (Address Number &amp; Street)
  * @return addressL4
  */
 String getAddressL4();

 /**
  * Line 5 Mail formatted AFNOR NF Z 10-011 (Postal Box, district)
  * @return addressL5
  */
 String getAddressL5();

 /**
  * Line 6 Mail formatted AFNOR NF Z 10-011 (Zip code &amp; city)
  * @return addressL6
  */
 String getAddressL6();

 /**
  * Line 7 Mail formatted AFNOR NF Z 10-011 (Country)
  * @return addressL7
  */
 String getAddressL7();

}
