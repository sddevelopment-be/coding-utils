/**
 * <p>
 *   When working with external/JDK libraries, the checked exceptions they throw
 *   sometimes prevent you from writing the code you want.
 *   The most common strategies of dealing with unwanted checked exceptions are:
 *      - ignoring them
 *      - converting them to unchecked exceptions
 *      - converting the return type to an Optional.empty()
 *      - handling them with an alternative flow / logging
 * </p>
 *
 * @author <a href="https://github.com/stijn-dejongh" target="_blank">Stijn Dejongh</a>
 * @created 31.10.20, Saturday
 * @since 1.0.0
 **/
package be.sddevelopment.utils.exceptions;
