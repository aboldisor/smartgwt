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
 
package com.smartgwt.client.widgets.form.fields;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
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
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * FormItem for adding a Button to a form.
 */
@BeanFactory.FrameworkClass
public class ButtonItem extends CanvasItem implements com.smartgwt.client.widgets.form.fields.events.HasClickHandlers {

    public static ButtonItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);

		if(obj != null && JSOHelper.getAttribute(jsObj,"__ref")==null) {
            return com.smartgwt.client.util.ObjectFactory.createFormItem("ButtonItem",jsObj);

        } else
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (ButtonItem) obj;
        } else {
            return new ButtonItem(jsObj);
        }
    }


    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc.ButtonItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc.ButtonItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;
    /**
     * Changes the defaults for DrawItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults DrawItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, DrawItem defaults) /*-{
        $wnd.isc.ButtonItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.drawing.DrawItem::getJsObj()());
    }-*/;

    public static native void changePickerIconDefaults(FormItemIcon defaults) /*-{
        $wnd.isc.ButtonItem.changeDefaults("pickerIconDefaults", defaults.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public ButtonItem(){
        setAttribute("editorType", "ButtonItem");
    }

    public ButtonItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public ButtonItem(String name) {
        setName(name);
                setAttribute("editorType", "ButtonItem");
    }


    public ButtonItem(String name, String title) {
        setName(name);
		setTitle(title);
                setAttribute("editorType", "ButtonItem");
    }


    // ********************* Properties / Attributes ***********************

    /**
     * Should the button auto fit to its title. Maps to {@link com.smartgwt.client.widgets.Button#getAutoFit autoFit}
     * attribute. Note that if an explicit width or height is specified for this item, it will be respected, disabling autoFit
     * behavior
     *
     * @param autoFit  Default value is true
     */
    public void setAutoFit(Boolean autoFit) {
        setAttribute("autoFit", autoFit);
    }

    /**
     * Should the button auto fit to its title. Maps to {@link com.smartgwt.client.widgets.Button#getAutoFit autoFit}
     * attribute. Note that if an explicit width or height is specified for this item, it will be respected, disabling autoFit
     * behavior
     *
     * @return Boolean
     */
    public Boolean getAutoFit()  {
        return getAttributeAsBoolean("autoFit");
    }
    

    /**
     * Optional <code>baseStyle</code> will be applied to the button.
     *
     * @param baseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setBaseStyle(String baseStyle) {
        setAttribute("baseStyle", baseStyle);
    }

    /**
     * Optional <code>baseStyle</code> will be applied to the button.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getBaseStyle()  {
        return getAttributeAsString("baseStyle");
    }
    

    /**
     * This item is an autoChild generated {@link com.smartgwt.client.widgets.Canvas} displayed by the ButtonItem and is an
     * instance of {@link com.smartgwt.client.widgets.Button} by defaut, cuztomizeable  via the {@link
     * com.smartgwt.client.widgets.form.fields.ButtonItem#getButtonConstructor buttonConstructor} attribute.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Canvas
     */
    public Canvas getButton()  {
        return (Canvas)Canvas.getByJSObject(getAttributeAsJavaScriptObject("button"));
    }
    
    
    

    /**
     * These items are in a row by themselves by default
     *
     * @param endRow  Default value is true
     * @see com.smartgwt.client.docs.FormLayout FormLayout overview and related methods
     */
    public void setEndRow(Boolean endRow) {
        setAttribute("endRow", endRow);
    }

    /**
     * These items are in a row by themselves by default
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.FormLayout FormLayout overview and related methods
     */
    public Boolean getEndRow()  {
        return getAttributeAsBoolean("endRow");
    }
    
    

    /**
     * Optional icon image to display on the button for this item.  See {@link com.smartgwt.client.widgets.Button#getIcon
     * icon}.
     *
     * @param icon  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is null
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setIcon(String icon) {
        setAttribute("icon", icon);
    }

    /**
     * Optional icon image to display on the button for this item.  See {@link com.smartgwt.client.widgets.Button#getIcon
     * icon}.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getIcon()  {
        return getAttributeAsString("icon");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to <code>false</code>, how should
     * this item be displayed to the user? <P> The default value for ButtonItems is <code>disabled</code> - note that 
     * <code>readOnly</code> and <code>static</code> appearances have no effect for ButtonItems
     *
     * @param readOnlyDisplay  Default value is "disabled"
     */
    public void setReadOnlyDisplay(ReadOnlyDisplayAppearance readOnlyDisplay) {
        setAttribute("readOnlyDisplay", readOnlyDisplay == null ? null : readOnlyDisplay.getValue());
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to <code>false</code>, how should
     * this item be displayed to the user? <P> The default value for ButtonItems is <code>disabled</code> - note that 
     * <code>readOnly</code> and <code>static</code> appearances have no effect for ButtonItems
     *
     * @return ReadOnlyDisplayAppearance
     */
    public ReadOnlyDisplayAppearance getReadOnlyDisplay()  {
        return EnumUtil.getEnum(ReadOnlyDisplayAppearance.values(), getAttribute("readOnlyDisplay"));
    }
    

    /**
     * Buttons do not show a title by default.
     *
     * @param showTitle  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowTitle(Boolean showTitle) {
        setAttribute("showTitle", showTitle);
    }

    /**
     * Buttons do not show a title by default.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowTitle()  {
        return getAttributeAsBoolean("showTitle");
    }
    

    /**
     * These items are in a row by themselves by default
     *
     * @param startRow  Default value is true
     * @see com.smartgwt.client.docs.FormLayout FormLayout overview and related methods
     */
    public void setStartRow(Boolean startRow) {
        setAttribute("startRow", startRow);
    }

    /**
     * These items are in a row by themselves by default
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.FormLayout FormLayout overview and related methods
     */
    public Boolean getStartRow()  {
        return getAttributeAsBoolean("startRow");
    }
    

    // ********************* Methods ***********************
    /**
     * Add a click handler.
     * <p>
     * Called when a ButtonItem is clicked on.
     *
     * @param handler the click handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addClickHandler(com.smartgwt.client.widgets.form.fields.events.ClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.form.fields.events.ClickEvent.getType()) == 0) setupClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.form.fields.events.ClickEvent.getType());
    }

    private native void setupClickEvent() /*-{
        var obj = null;
        obj = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var selfJ = this;
        var click = $debox($entry(function(param){
            var event = @com.smartgwt.client.widgets.form.fields.events.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
            selfJ.@com.smartgwt.client.core.DataClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        obj.click = 
            function () {
                var param = {"form" : arguments[0], "item" : arguments[1]};
                return click(param) == true;
            }
        ;
   }-*/;

    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties of the class instance passed to this function.
     * This is a powerful feature that eliminates the need for users to create a separate
     * hierarchy of subclasses that only alter the default properties of this class. Can also
     * be used for skinning / styling purposes.  <P> <b>Note:</b> This method is intended for
     * setting default attributes only and will affect all instances of the underlying class
     * (including those automatically generated in JavaScript).  This method should not be used
     * to apply standard EventHandlers or override methods for a class - use a custom subclass
     * instead.  Calling this method after instances have been created can result in undefined
     * behavior, since it bypasses any setters and a class instance may have already examined 
     * a particular property and not be expecting any changes through this route.
     *
     * @param buttonItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(ButtonItem buttonItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},buttonItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.ButtonItem.addProperties(properties);
    }-*/;

    // ***********************************************************


    public Canvas getCanvas() {
        return Button.getOrCreateRef(getAttributeAsJavaScriptObject("canvas"));
    }

    /**
     * Custom Properties to apply to the button item.
     *
     * @param buttonProperties properties to apply to the button item.
     */
    public void setButtonProperties(Button buttonProperties) {
        setAttribute("buttonProperties", buttonProperties.getConfig());
    }

}


