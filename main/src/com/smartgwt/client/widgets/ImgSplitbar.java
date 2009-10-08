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
 
package com.smartgwt.client.widgets;



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
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * Subclass of the {@link com.smartgwt.client.widgets.Img} class. As with the {@link com.smartgwt.client.widgets.Splitbar}
 * class,   widgets of this class can be displayed as a resize-bar for widgets   in Layouts where showResizeBar is set to
 * true. Provides a different appearance from  the <code>Splitbar</code> class.<br>  To specify the resizeBar class for
 * some layout, use the {@link com.smartgwt.client.widgets.layout.Layout#getResizeBarClass resizeBarClass}  property.
 */
public class ImgSplitbar extends Img {

    public static ImgSplitbar getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (ImgSplitbar) obj;
        } else {
            return new ImgSplitbar(jsObj);
        }
    }

    public ImgSplitbar(){
        
    }

    public ImgSplitbar(JavaScriptObject jsObj){
        super(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var widget = $wnd.isc.ImgSplitbar.create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************


    /**
     * Is this split bar vertically orientated?<br> When a <code>Splitbar</code> is created by a layout to be the resizeBar for
     * some member of the layout, the <code>vertical</code> property will be set to <code>true</code> if the layout is
     * horizontal, meaning this resizeBar will be taller than it is wide,  and will allow horizontal resizing of the member.
     *
     * <b>Note :</b> This method should be called only after the widget has been rendered.
     *
     * @return Boolean
     * @throws IllegalStateException if widget has not yet been rendered.
     */
    public Boolean getVertical() throws IllegalStateException {
        errorIfNotCreated("vertical");
        return getAttributeAsBoolean("vertical");
    }

    /**
     * <code>canDrag</code> set to true to allow dragging of the split bar. Dragging the Splitbar will resize it's {@link
     * com.smartgwt.client.widgets.Splitbar#getTarget 'target'}
     *
     * @param canDrag canDrag Default value is true
     */
    public void setCanDrag(Boolean canDrag) {
        setAttribute("canDrag", canDrag, true);
    }

    /**
     * <code>canDrag</code> set to true to allow dragging of the split bar. Dragging the Splitbar will resize it's {@link
     * com.smartgwt.client.widgets.Splitbar#getTarget 'target'}
     *
     *
     * @return Boolean
     */
    public Boolean getCanDrag()  {
        return getAttributeAsBoolean("canDrag");
    }

    /**
     * If this property is true, a click on the Splitbar will collapse its  {@link
     * com.smartgwt.client.widgets.Splitbar#getTarget 'target'}, hiding it and shifting the Splitbar and other members of the
     * layout across to fill the newly available space. If the target is already hidden a click will expand it again (showing
     * it at it's normal size).
     *
     * @param canCollapse canCollapse Default value is true
     */
    public void setCanCollapse(Boolean canCollapse) {
        setAttribute("canCollapse", canCollapse, true);
    }

    /**
     * If this property is true, a click on the Splitbar will collapse its  {@link
     * com.smartgwt.client.widgets.Splitbar#getTarget 'target'}, hiding it and shifting the Splitbar and other members of the
     * layout across to fill the newly available space. If the target is already hidden a click will expand it again (showing
     * it at it's normal size).
     *
     *
     * @return Boolean
     */
    public Boolean getCanCollapse()  {
        return getAttributeAsBoolean("canCollapse");
    }

    /**
     * Default directory for skin images (those defined by the class), relative to the Page-wide {@link
     * com.smartgwt.client.util.Page#getSkinDir}.
     *
     * @param skinImgDir skinImgDir Default value is "images/SplitBar/"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSkinImgDir(String skinImgDir)  throws IllegalStateException {
        setAttribute("skinImgDir", skinImgDir, false);
    }

    /**
     * Default directory for skin images (those defined by the class), relative to the Page-wide {@link
     * com.smartgwt.client.util.Page#getSkinDir}.
     *
     *
     * @return String
     */
    public String getSkinImgDir()  {
        return getAttributeAsString("skinImgDir");
    }

    /**
     * The base filename for the image. <P> If <code>img.state</code> is set, it's value will be appended to the URL before the
     * file extension.   <P> For example, given an <code>src</code> of "findIcon.gif" and a state of "Disabled", the resulting
     * image name would be "findIcon_Disabled.gif".  Compound states such as "Selected", "Focused" and "Over" or "Down" will
     * have an intervening underscore, resulting in, for example, <code>"findIcon_Selected_Down.gif"</code>.
     *
     * @param src src Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSrc(String src)  throws IllegalStateException {
        setAttribute("src", src, false);
    }

    /**
     * The base filename for the image. <P> If <code>img.state</code> is set, it's value will be appended to the URL before the
     * file extension.   <P> For example, given an <code>src</code> of "findIcon.gif" and a state of "Disabled", the resulting
     * image name would be "findIcon_Disabled.gif".  Compound states such as "Selected", "Focused" and "Over" or "Down" will
     * have an intervening underscore, resulting in, for example, <code>"findIcon_Selected_Down.gif"</code>.
     *
     *
     * @return String
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }

    /**
     * Default src to display when {@link com.smartgwt.client.widgets.ImgSplitbar#getVertical vertical} is false,  and {@link
     * com.smartgwt.client.widgets.ImgSplitbar#getSrc src} is unset.
     *
     * @param hSrc hSrc Default value is [SKIN]hgrip.png
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setHSrc(String hSrc)  throws IllegalStateException {
        setAttribute("hSrc", hSrc, false);
    }

    /**
     * Default src to display when {@link com.smartgwt.client.widgets.ImgSplitbar#getVertical vertical} is false,  and {@link
     * com.smartgwt.client.widgets.ImgSplitbar#getSrc src} is unset.
     *
     *
     * @return String
     */
    public String getHSrc()  {
        return getAttributeAsString("hSrc");
    }

    /**
     * Default src to display when {@link com.smartgwt.client.widgets.ImgSplitbar#getVertical vertical} is true,  and {@link
     * com.smartgwt.client.widgets.ImgSplitbar#getSrc src} is unset.
     *
     * @param vSrc vSrc Default value is [SKIN]vgrip.png
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setVSrc(String vSrc)  throws IllegalStateException {
        setAttribute("vSrc", vSrc, false);
    }

    /**
     * Default src to display when {@link com.smartgwt.client.widgets.ImgSplitbar#getVertical vertical} is true,  and {@link
     * com.smartgwt.client.widgets.ImgSplitbar#getSrc src} is unset.
     *
     *
     * @return String
     */
    public String getVSrc()  {
        return getAttributeAsString("vSrc");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

}



