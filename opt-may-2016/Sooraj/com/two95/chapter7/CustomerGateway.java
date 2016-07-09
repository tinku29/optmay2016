package com.two95.chapter7;

import java.util.*;
import java.io.*;
/**
* Gateway class that has several methods to retrieve customers
* information.
*
* @author Steve
* @since October, 2006
* @version 1.0
*/
public class CustomerGateway {
// Global Variables
private static final int MAX_ACCOUNTS = 3;
/**
* Retrieves the Customer profile based on SSN.
*
* @param ssn – The SSN of the Customer
* @return String – The profile of the Customer
* @throws IOException – Thrown when Customer is not found
*/
public String getCustomerProfile (String ssn) throws IOException
{
return "John, 1234 Broad St, NY";
}
}
