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
 
package com.smartgwt.client.widgets.menu;


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
 * Object specifying an item in a {@link com.smartgwt.client.widgets.menu.Menu}.  Each <code>MenuItem</code> can have a
 * {@link com.smartgwt.client.widgets.menu.MenuItem#getTitle title}, {@link
 * com.smartgwt.client.widgets.menu.MenuItem#getIcon icon}, {@link com.smartgwt.client.widgets.menu.MenuItem#getKeys
 * shortcut\n keys}, optional {@link com.smartgwt.client.widgets.menu.MenuItem#getSubmenu submenu} and various other
 * settings.
 *  
 *  
 * To create a Menu, create a series of MenuItems and call {@link com.smartgwt.client.widgets.menu.Menu#setItems
 * Menu.setItems}.
 *  
 *  <p>
 *  Alternatively, Menus support binding to a {@link com.smartgwt.client.widgets.menu.Menu#getDataSource DataSource}.
 *  <p>
 *  As another option, here's a sample of a Menu in {@link com.smartgwt.client.docs.ComponentXML Component XML}:
 *  <pre>
 *  &lt;Menu&gt;
 *     &lt;items&gt;
 *         &lt;MenuItem title="item1" click="alert(1)"/&gt;
 *         &lt;MenuItem title="item2"/&gt;
 *     &lt;/items&gt;
 *  &lt;/Menu&gt;
 *  </pre>
 */
@BeanFactory.FrameworkClass
public class MenuItem extends ListGridRecord implements com.smartgwt.client.widgets.menu.events.HasClickHandlers {

    public static MenuItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);


        if(obj != null) {
            obj.setJsObj(jsObj);
            return (MenuItem) obj;
        } else {
            return new MenuItem(jsObj);
        }
    }


    public MenuItem(){
        
    }

    public MenuItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public MenuItem(String title) {
        setTitle(title);
                
    }


    public MenuItem(String title, String icon) {
        setTitle(title);
		setIcon(icon);
                
    }


    public MenuItem(String title, String icon, String keyTitle) {
        setTitle(title);
		setIcon(icon);
		setKeyTitle(keyTitle);
                
    }


    // ********************* Properties / Attributes ***********************

    /**
     * A MenuItem that has a submenu normally cannot be selected, instead clicking or hitting Enter while keyboard focus is on
     * the item shows the submenu.  Setting canSelectParent:true allows a menu item with a submenu to be selected directly.
     *
     * @param canSelectParent  Default value is null
     */
    public void setCanSelectParent(Boolean canSelectParent) {
        setAttribute("canSelectParent", canSelectParent);
    }

    /**
     * A MenuItem that has a submenu normally cannot be selected, instead clicking or hitting Enter while keyboard focus is on
     * the item shows the submenu.  Setting canSelectParent:true allows a menu item with a submenu to be selected directly.
     *
     * @return Boolean
     */
    public Boolean getCanSelectParent()  {
        return getAttributeAsBoolean("canSelectParent");
    }
    

    /**
     * If true, this item displays a standard checkmark image to the left of its title.  You can set the checkmark image URL by
     * setting {@link com.smartgwt.client.widgets.menu.Menu#getCheckmarkImage checkmarkImage}. <p> If you need to set this
     * state dynamically, use {@link com.smartgwt.client.widgets.menu.MenuItem#checkIf MenuItem.checkIf} instead.
     *
     * @param checked  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public void setChecked(Boolean checked) {
        setAttribute("checked", checked);
    }

    /**
     * If true, this item displays a standard checkmark image to the left of its title.  You can set the checkmark image URL by
     * setting {@link com.smartgwt.client.widgets.menu.Menu#getCheckmarkImage checkmarkImage}. <p> If you need to set this
     * state dynamically, use {@link com.smartgwt.client.widgets.menu.MenuItem#checkIf MenuItem.checkIf} instead.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public Boolean getChecked()  {
        return getAttributeAsBoolean("checked");
    }
    

    /**
     * The filename for this item's custom icon when the item is disabled. If both this property and {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getChecked checked} are both specified, only the icon specified by this
     * property will be displayed. The path to the loaded skin directory and the skinImgDir are prepended to this filename to
     * form the full URL. <p> If you need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#dynamicIcon MenuItem.dynamicIcon} instead.
     *
     * @param disabledIcon  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public void setDisabledIcon(String disabledIcon) {
        setAttribute("disabledIcon", disabledIcon);
    }

    /**
     * The filename for this item's custom icon when the item is disabled. If both this property and {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getChecked checked} are both specified, only the icon specified by this
     * property will be displayed. The path to the loaded skin directory and the skinImgDir are prepended to this filename to
     * form the full URL. <p> If you need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#dynamicIcon MenuItem.dynamicIcon} instead.
     *
     * @return String
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public String getDisabledIcon()  {
        return getAttributeAsString("disabledIcon");
    }
    

    /**
     * Affects the visual style and interactivity of the menu item.  If set to <code>false</code>, the menu item will not
     * respond to mouse rollovers or clicks. <p> If you need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#enableIf MenuItem.enableIf} instead.
     *
     * @param enabled  Default value is true
     */
    public void setEnabled(Boolean enabled) {
        setAttribute("enabled", enabled);
    }

    /**
     * Affects the visual style and interactivity of the menu item.  If set to <code>false</code>, the menu item will not
     * respond to mouse rollovers or clicks. <p> If you need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#enableIf MenuItem.enableIf} instead.
     *
     * @return Boolean
     */
    public Boolean getEnabled()  {
        return getAttributeAsBoolean("enabled");
    }
    

    /**
     * If false, no submenus will be fetched for this MenuItem. This can be set globally via {@link
     * com.smartgwt.client.widgets.menu.Menu#getFetchSubmenus fetchSubmenus}.
     *
     * @param fetchSubmenus  Default value is true
     */
    public void setFetchSubmenus(Boolean fetchSubmenus) {
        setAttribute("fetchSubmenus", fetchSubmenus);
    }

    /**
     * If false, no submenus will be fetched for this MenuItem. This can be set globally via {@link
     * com.smartgwt.client.widgets.menu.Menu#getFetchSubmenus fetchSubmenus}.
     *
     * @return Boolean
     */
    public Boolean getFetchSubmenus()  {
        return getAttributeAsBoolean("fetchSubmenus");
    }
    

    /**
     * The filename for this item's custom icon. If both this property and {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getChecked checked} are both specified, only the icon specified by this
     * property will be displayed. The path to the loaded skin directory and the skinImgDir are prepended to this filename to
     * form the full URL. If this item is disabled, and {@link com.smartgwt.client.widgets.menu.MenuItem#getDisabledIcon
     * disabledIcon} is set, then that icon will be used instead. <p> If you need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#dynamicIcon MenuItem.dynamicIcon} instead.
     *
     * @param icon  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public void setIcon(String icon) {
        setAttribute("icon", icon);
    }

    /**
     * The filename for this item's custom icon. If both this property and {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getChecked checked} are both specified, only the icon specified by this
     * property will be displayed. The path to the loaded skin directory and the skinImgDir are prepended to this filename to
     * form the full URL. If this item is disabled, and {@link com.smartgwt.client.widgets.menu.MenuItem#getDisabledIcon
     * disabledIcon} is set, then that icon will be used instead. <p> If you need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#dynamicIcon MenuItem.dynamicIcon} instead.
     *
     * @return String
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public String getIcon()  {
        return getAttributeAsString("icon");
    }
    

    /**
     * The height applied to this item's icon.  The default of <code>16</code> can be changed for all MenuItems by overriding
     * {@link com.smartgwt.client.widgets.menu.Menu#getIconHeight iconHeight}.
     *
     * @param iconHeight  Default value is 16
     */
    public void setIconHeight(int iconHeight) {
        setAttribute("iconHeight", iconHeight);
    }

    /**
     * The height applied to this item's icon.  The default of <code>16</code> can be changed for all MenuItems by overriding
     * {@link com.smartgwt.client.widgets.menu.Menu#getIconHeight iconHeight}.
     *
     * @return int
     */
    public int getIconHeight()  {
        return getAttributeAsInt("iconHeight");
    }
    

    /**
     * The width applied to this item's icon.  The default of <code>16</code> can be changed for all MenuItems by overriding
     * {@link com.smartgwt.client.widgets.menu.Menu#getIconWidth iconWidth}.
     *
     * @param iconWidth  Default value is 16
     */
    public void setIconWidth(int iconWidth) {
        setAttribute("iconWidth", iconWidth);
    }

    /**
     * The width applied to this item's icon.  The default of <code>16</code> can be changed for all MenuItems by overriding
     * {@link com.smartgwt.client.widgets.menu.Menu#getIconWidth iconWidth}.
     *
     * @return int
     */
    public int getIconWidth()  {
        return getAttributeAsInt("iconWidth");
    }
    

    /**
     * When set to <code>true</code>, this menu item shows a horizontal separator instead of the {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getTitle title} text.  Typically specified as the only property of a menu
     * item, since the separator will not respond to mouse events.
     *
     * @param isSeparator  Default value is false
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public void setIsSeparator(Boolean isSeparator) {
        setAttribute("isSeparator", isSeparator);
    }

    /**
     * When set to <code>true</code>, this menu item shows a horizontal separator instead of the {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getTitle title} text.  Typically specified as the only property of a menu
     * item, since the separator will not respond to mouse events.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public Boolean getIsSeparator()  {
        return getAttributeAsBoolean("isSeparator");
    }
    
    

    /**
     * A string to display in the shortcut-key column for this item. If not specified, the first KeyName value in {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getKeys keys} will be used by default.
     *
     * @param keyTitle  Default value is see below
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public void setKeyTitle(String keyTitle) {
        setAttribute("keyTitle", keyTitle);
    }

    /**
     * A string to display in the shortcut-key column for this item. If not specified, the first KeyName value in {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getKeys keys} will be used by default.
     *
     * @return String
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public String getKeyTitle()  {
        return getAttributeAsString("keyTitle");
    }
    

    /**
     * A reference to another menu, to display as a submenu when the mouse cursor hovers over this menu item.
     *
     * @param submenu  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" target="examples">Appearance Example</a>
     */
    public void setSubmenu(Menu submenu) {
        setAttribute("submenu", submenu == null ? null : submenu.getOrCreateJsObj());
    }
    

    /**
     * The text displayed for the menu item
     *
     * @param title  Default value is null
     */
    public void setTitle(String title) {
        setAttribute("title", title);
    }

    /**
     * The text displayed for the menu item
     *
     * @return String
     */
    public String getTitle()  {
        return getAttributeAsString("title");
    }
    

    // ********************* Methods ***********************
    /**
     * Add a click handler.
     * <p>
     * Executed when this menu item is clicked by the user. The click handler must be specified as a function or string of
     * script.  Call {@link com.smartgwt.client.widgets.menu.events.MenuItemClickEvent#cancel()} from within {@link
     * com.smartgwt.client.widgets.menu.events.ClickHandler#onClick} to suppress the {@link
     * com.smartgwt.client.widgets.menu.Menu#addItemClickHandler Menu.itemClick} handler if specified.
     *
     * @param handler the click handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addClickHandler(com.smartgwt.client.widgets.menu.events.ClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.menu.events.MenuItemClickEvent.getType()) == 0) setupClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.menu.events.MenuItemClickEvent.getType());
    }

    private native void setupClickEvent() /*-{
        var obj = null;
        obj = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var selfJ = this;
        var click = $entry(function(){
            var param = {"target" : arguments[0], "item" : arguments[1], "menu" : arguments[2], "colNum" : arguments[3]};
            var event = @com.smartgwt.client.widgets.menu.events.MenuItemClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
            selfJ.@com.smartgwt.client.core.DataClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        obj.click =  click 
        ;
   }-*/;

    // ********************* Static Methods ***********************

    // ***********************************************************


    /**
     * Shortcut key(s) to fire the menu item action. Each key can be defined as a {@link KeyIdentifier}.
     * To apply multiple shortcut keys to this item, set this property to an array of such key identifiers.
     *
     * @param keys keys Default value is null
     */
    public void setKeys(KeyIdentifier... keys) {
        setAttribute("keys", keys);
    }

    /**
     * Contains the condition that will enable or disable the curent menuItem. The handler must be specified as a
     * function or string of script.  Return false to disable the menuItem or true to enable it <p> If you don't need to
     * set this state dynamically, use {@link com.smartgwt.client.widgets.menu.MenuItem#getEnabled enabled} instead.
     */
    public native void setEnableIfCondition(MenuItemIfFunction enableIf) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.enableIf = $debox($entry(function(target, menu, item) {
            var targetJ;
            if (target == null) {
                targetJ = null;
            } else if(@com.smartgwt.client.widgets.tab.Tab::isTab(Lcom/google/gwt/core/client/JavaScriptObject;)(target)) {
                targetJ = @com.smartgwt.client.widgets.tab.Tab::getTabSet(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            } else {
                targetJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            }
            var menuJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(menu);
            var itemJ = @com.smartgwt.client.widgets.menu.MenuItem::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(item);
            return enableIf.@com.smartgwt.client.widgets.menu.MenuItemIfFunction::execute(Lcom/smartgwt/client/widgets/Canvas;Lcom/smartgwt/client/widgets/menu/Menu;Lcom/smartgwt/client/widgets/menu/MenuItem;)(targetJ, menuJ, itemJ);
        }));
    }-*/;

    /**
     * Contains the condition that will check or uncheck the curent menuItem. The handler must be specified as a
     * function or string of script.  Return false to uncheck the menuItem or true to check it <p> If you don't need to
     * set this state dynamically, use {@link com.smartgwt.client.widgets.menu.MenuItem#getChecked checked} instead.
     */
    public native void setCheckIfCondition(MenuItemIfFunction checkIf) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.checkIf = $debox($entry(function(target, menu, item) {
            var targetJ;
            if (target == null) {
                targetJ = null;
            } else if(@com.smartgwt.client.widgets.tab.Tab::isTab(Lcom/google/gwt/core/client/JavaScriptObject;)(target)) {
                targetJ = @com.smartgwt.client.widgets.tab.Tab::getTabSet(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            } else {
                targetJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            }
            var menuJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(menu);
            var itemJ = @com.smartgwt.client.widgets.menu.MenuItem::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(item);
            return checkIf.@com.smartgwt.client.widgets.menu.MenuItemIfFunction::execute(Lcom/smartgwt/client/widgets/Canvas;Lcom/smartgwt/client/widgets/menu/Menu;Lcom/smartgwt/client/widgets/menu/MenuItem;)(targetJ, menuJ, itemJ);
         }));
    }-*/;

    /**
     * Contains the condition that will change the curent items' title when met. The handler must be specified as a
     * function or string of script.   <p> If you don't need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getTitle title} instead.
     */
    public native void setDynamicTitleFunction(MenuItemStringFunction handler) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.dynamicTitle = $debox($entry(function(target, menu, item) {
            var targetJ;
            if(target == null) {
                targetJ = null;
            } else if(@com.smartgwt.client.widgets.tab.Tab::isTab(Lcom/google/gwt/core/client/JavaScriptObject;)(target)) {
                targetJ = @com.smartgwt.client.widgets.tab.Tab::getTabSet(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            } else {
                targetJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            }
            var menuJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(menu);
            var itemJ = @com.smartgwt.client.widgets.menu.MenuItem::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(item);
            return handler.@com.smartgwt.client.widgets.menu.MenuItemStringFunction::execute(Lcom/smartgwt/client/widgets/Canvas;Lcom/smartgwt/client/widgets/menu/Menu;Lcom/smartgwt/client/widgets/menu/MenuItem;)(targetJ, menuJ, itemJ);
        }));
    }-*/;

    /**
     * Contains the condition that will change the curent items' icon when met. The handler must be specified as a
     * function or string of script. <p> If you don't need to set this state dynamically, use {@link
     * com.smartgwt.client.widgets.menu.MenuItem#getIcon icon} instead.
     */
    public native void setDynamicIconFunction(MenuItemStringFunction handler) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.dynamicIcon = $debox($entry(function(target, menu, item) {
            var targetJ;
            if(target == null) {
                targetJ = null;
            } else if(@com.smartgwt.client.widgets.tab.Tab::isTab(Lcom/google/gwt/core/client/JavaScriptObject;)(target)) {
                targetJ = @com.smartgwt.client.widgets.tab.Tab::getTabSet(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            } else {
                targetJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(target);
            }
            var menuJ = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(menu);
            var itemJ = @com.smartgwt.client.widgets.menu.MenuItem::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(item);
            return handler.@com.smartgwt.client.widgets.menu.MenuItemStringFunction::execute(Lcom/smartgwt/client/widgets/Canvas;Lcom/smartgwt/client/widgets/menu/Menu;Lcom/smartgwt/client/widgets/menu/MenuItem;)(targetJ, menuJ, itemJ);
        }));
    }-*/;

    /**
     * A reference to another menu, to display as a submenu when the mouse cursor hovers over
     * this menu item.
     *
     * @return Menu
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#menus_category_appearance" 
     * target="examples">Appearance Example</a>
     * @deprecated use {@link com.smartgwt.client.widgets.Menu#getSubmenu} instead
     */
    @Deprecated
    public Menu getSubmenu()  {
        SC.logWarn("MenuItem.getSubmenu() is deprecated in favor of Menu.getSubmenu()");
        return Menu.getOrCreateRef(getAttributeAsJavaScriptObject("submenu"), this);
    }

}


