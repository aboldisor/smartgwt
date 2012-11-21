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
 
package com.smartgwt.client.widgets.drawing;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;

/**
 * An ordinary JavaScript object containing properties that describe a radial gradient
 */
public class RadialGradient extends Gradient {

    public static RadialGradient getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        return new RadialGradient(jsObj);
    }

    public void setJavaScriptObject(JavaScriptObject jsObj) {
        this.jsObj = jsObj;
    }


    public RadialGradient(){
        
    }

    public RadialGradient(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }

    // ********************* Properties / Attributes ***********************

    /**
     * x coordinate of outer radial
     *
     * @param cx . See {@link com.smartgwt.client.docs.String String}. Default value is null
     */
    public void setCx(String cx) {
        setAttribute("cx", cx);
    }

    /**
     * x coordinate of outer radial
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getCx()  {
        return getAttributeAsString("cx");
    }

    /**
     * y coordinate of outer radial
     *
     * @param cy . See {@link com.smartgwt.client.docs.String String}. Default value is null
     */
    public void setCy(String cy) {
        setAttribute("cy", cy);
    }

    /**
     * y coordinate of outer radial
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getCy()  {
        return getAttributeAsString("cy");
    }

    /**
     * x coordinate of inner radial
     *
     * @param fx . See {@link com.smartgwt.client.docs.String String}. Default value is null
     */
    public void setFx(String fx) {
        setAttribute("fx", fx);
    }

    /**
     * x coordinate of inner radial
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getFx()  {
        return getAttributeAsString("fx");
    }

    /**
     * y coordinate of inner radial
     *
     * @param fy . See {@link com.smartgwt.client.docs.String String}. Default value is 0
     */
    public void setFy(String fy) {
        setAttribute("fy", fy);
    }

    /**
     * y coordinate of inner radial
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getFy()  {
        return getAttributeAsString("fy");
    }

    /**
     * radius
     *
     * @param r . See {@link com.smartgwt.client.docs.String String}. Default value is null
     */
    public void setR(String r) {
        setAttribute("r", r);
    }

    /**
     * radius
     *
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getR()  {
        return getAttributeAsString("r");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************
        
    // ***********************************************************        

}





