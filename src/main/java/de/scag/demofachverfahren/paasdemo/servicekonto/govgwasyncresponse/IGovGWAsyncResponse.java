/*
 * IGovGWAsyncResponse.java
 *
 * Version $Revision$ $Date$
 *
 * This file is part of ISBJ.
 *
 * Copyright 2017 Senatsverwaltung fuer Bildung, Jugend und Familie, Berlin.
 * Created by Schuetze Consulting AG, Berlin.
 */
package de.scag.demofachverfahren.paasdemo.servicekonto.govgwasyncresponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 */
@WebService(name = "IGovGWAsyncResponse", targetNamespace = "http://tempuri.org/")
public interface IGovGWAsyncResponse {
    /**
     * Sendet eine Nachricht an das Service-Konto.
     *
     * @param strMessageID                                die ID der Nachricht
     * @param strPrice                                    der Preis (muss 0
     *                                                    sein)
     * @param nUserID                                     die ID des
     *                                                    Service-Konto
     * @param nServiceID                                  die ID des
     *                                                    Fachdienstes
     * @param strHistory                                  der Betreff
     * @param strXMLData                                  XML-Daten der
     *                                                    Nachricht
     * @param attachments                                 Anhaenge
     * @param setQueryResultWithPriceAndAttachmentsResult Out-Parameter für das
     *                                                    Ergebnis: <code>
     *                                                    true</code> bedeutet
     *                                                    alles ok.
     * @param strErrorMessage                             Out-Parameter für die
     *                                                    Fehlermeldung
     */
    @WebMethod(
            operationName = "SetQueryResultWithPriceAndAttachments",
            action = "http://tempuri.org/IGovGWAsyncResponse/SetQueryResultWithPriceAndAttachments"
    )

    // @RequestWrapper(
    // localName = "IGovGWAsyncResponse_SetQueryResultWithPriceAndAttachments_InputMessage",
    // targetNamespace = "http://tempuri.org/",
    // className =
    // "de.verwalt_berlin.senbjw.isbj.servicekonto.client.SetQueryResultWithPriceAndAttachments"
    // )
    // @ResponseWrapper(
    // localName = "IGovGWAsyncResponse_SetQueryResultWithPriceAndAttachments_OutputMessage",
    // targetNamespace = "http://tempuri.org/",
    // className =
    // "de.verwalt_berlin.senbjw.isbj.servicekonto.client.SetQueryResultWithPriceAndAttachmentsResponse"
    // )
    @SuppressWarnings(
            "checkstyle:com.puppycrawl.tools.checkstyle.checks.sizes.ParameterNumberCheck"
    )
    void setQueryResultWithPriceAndAttachments(
            @WebParam(name = "strMessageID", targetNamespace = "http://tempuri.org/") String strMessageID,
            @WebParam(name = "strPrice", targetNamespace = "http://tempuri.org/") String strPrice,
            @WebParam(name = "nUserID", targetNamespace = "http://tempuri.org/") Long nUserID,
            @WebParam(name = "nServiceID", targetNamespace = "http://tempuri.org/") Integer nServiceID,
            @WebParam(name = "strHistory", targetNamespace = "http://tempuri.org/") String strHistory,
            @WebParam(name = "strXMLData", targetNamespace = "http://tempuri.org/") String strXMLData,
            @WebParam(name = "attachments", targetNamespace = "http://tempuri.org/") ArrayOfFileAttachment attachments,
            @WebParam(
                    name = "SetQueryResultWithPriceAndAttachmentsResult",
                    targetNamespace = "http://tempuri.org/", mode = WebParam.Mode.OUT
            ) Holder<Boolean> setQueryResultWithPriceAndAttachmentsResult,
            @WebParam(
                    name = "strErrorMessage", targetNamespace = "http://tempuri.org/",
                    mode = WebParam.Mode.OUT
            ) Holder<String> strErrorMessage);
}