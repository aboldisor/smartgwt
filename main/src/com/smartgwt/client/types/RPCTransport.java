package com.smartgwt.client.types;


/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
/* sgwtgen */
 
/**
 * Smart GWT supports multiple RPC transports for maximum compatibility and feature richness. All of transports use HTTP as
 * the underlying protocol, but use different mechanisms for sending the HTTP request and processing the response.  The
 * transport is typically auto-selected for by based on the feature being used and the current browser settings.  For
 * advanced use cases, {@link com.smartgwt.client.rpc.RPCRequest#getTransport transport} and {@link
 * com.smartgwt.client.rpc.RPCManager#defaultTransport defaultTransport} are exposed as override points. <p>
 */
public enum RPCTransport implements ValueEnum {
    /**
     * Uses the XMLHttpRequest object to make the request to the server. Note that in some browsers with certain
     * configurations, this transport may not be available. See {@link com.smartgwt.client.docs.PlatformDependencies} for more
     * information. This transport is not useful with file uploads. Cannot be used to target cross-domain URLs directly.
     */
    XMLHTTPREQUEST("xmlHttpRequest"),
    /**
     * Write a SCRIPT tag into the DOM with a SRC attribute that targets an arbitrary URL. This transport is the only one that
     * allows direct cross-domain URL access.  <P> For {@link com.smartgwt.client.rpc.RPCRequest#getCallback callback} to work,
     * the server being contacted must support the ability to generate JavaScript code in the response that will call a
     * JavaScript function generated by Smart GWT. Smart GWT passes the name of the function to call via a URL parameter, which
     * can be controlled with {@link com.smartgwt.client.rpc.RPCRequest#getCallbackParam callbackParam}. This callback
     * mechanism is sometimes called the "JSONP" (JSON with Padding) approach.
     */
    SCRIPTINCLUDE("scriptInclude"),
    /**
     * Available with Smart GWT Server only. An HTML form is dynamically assembled that targets a hidden IFRAME. This mechanism
     * is supported on all browsers and cannot be disabled by end users.  <P> If using the Smart GWT Server and using  {@link
     * com.smartgwt.client.docs.ServerDataIntegration Server-side data integration}, the "hiddenFrame" transport is
     * automatically used for all RPCManager and DataSource requests if the "xmlHttpRequest" transport is not available. <P>
     * Cannot be used to target cross-domain URLs directly.
     */
    HIDDENFRAME("hiddenFrame");
    private String value;

    RPCTransport(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
