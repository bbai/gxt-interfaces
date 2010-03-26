package gxt.client.visual.interfaces.view;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Header;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ButtonBar;
import com.extjs.gxt.ui.client.widget.button.ToolButton;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Frame;

/**
 * @author eugenp
 */
public interface IContentPanelView extends ILayoutContainerView{

	/**
	 * Adds a button the the panel.
	 * @param button the button to add
	 */
	void addButton( Button button );
	
	/**
	 * Collapses the panel body so that it becomes hidden. Fires the <i>BeforeCollapse</i> before collapsing, then the <i>Collapse</i> event after collapsing.
	 */
	void collapse();
	
	/**
	 * Expands the panel body so that it becomes visible. Fires the <i>BeforeExpand</i> before expanding, then the <i>Expand</i> event after expanding.
	 */
	void expand();
	
	/**
	 * Returns true if animation is enabled for expand / collapse.
	 * @return the animCollapse true for animations
	 */
	boolean getAnimCollapse();
	
	/**
	 * Returns the panel's body element.
	 * @return the body
	 */
	El getBody();
	
	/**
	 * Returns true if the body border is enabled.
	 * @return the body border state
	 */
	boolean getBodyBorder();
	
	/**
	 * Returns the body style.
	 * @return the body style
	 */
	String getBodyStyle();
	
	/**
	 * Returns the panel's bottom component.
	 * @return the bottom component
	 */
	Component getBottomComponent();
	
	/**
	 * Returns the panel's button alignment.
	 * @return the button alignment
	 */
	HorizontalAlignment getButtonAlign();
	
	ButtonBar getButtonBar();
	
	/**
	 * Returns the panel's collapse button.
	 * @return the collapse button
	 */
	ToolButton getCollapseBtn();
	
	/**
	 * Returns true if the panel is collapsible.
	 * @return the collapsible state
	 */
	boolean getCollapsible();
	
	/**
	 * Provides access to internal elements.
	 * <p>
	 * Valid values are:
	 * <ul>
	 * <li>"body"</li>
	 * <li>"header"</li>
	 * <li>"bwrap"</li>
	 * </ul>
	 * </p>
	 * @param name the element name
	 * @return the element
	 */
	Element getElement( String name );
	
	/**
	 * Returns true if framing is enabled.
	 * @return the frame state
	 */
	boolean getFrame();
	
	/**
	 * Returns the height in pixels of the framing elements of this panel (including any top and bottom bars and header and footer elements, but not including the body height). To retrieve the body height see {@link #getInnerHeight}.
	 * @return the frame height
	 */
	int getFrameHeight();
	
	/**
	 * Returns the width in pixels of the framing elements of this panel (not including the body width). To retrieve the body width see {@link #getInnerWidth}.
	 * @return The frame width
	 */
	int getFrameWidth();
	
	/**
	 * Returns the panel's header.
	 * @return the header
	 */
	Header getHeader();
	
	/**
	 * Returns the panel's heading.
	 * @return the heading
	 */
	String getHeading();
	
	/**
	 * Returns the height in pixels of the body element (not including the height of any framing elements). For the frame height see {@link #getFrameHeight}.
	 * @return the inner height
	 */
	int getInnerHeight();
	
	/**
	 * Returns the width in pixels of the body element (not including the width of any framing elements). For the frame width see {@link #getFrameWidth}.
	 * @return the body width
	 */
	int getInnerWidth();
	
	El getLayoutTarget();
	
	int getMinButtonWidth();
	
	/**
	 * @return the titleCollapse
	 */
	boolean getTitleCollapse();
	
	/**
	 * Returns the panel's title text.
	 * @return the title text
	 * @deprecated use {@link #getHeading()}
	 */
	@Deprecated
	String getTitleText();
	
	/**
	 * Returns the panels top component.
	 * @return the top component
	 */
	Component getTopComponent();
	
	/**
	 * Returns true if the panel is collapsed.
	 * @return the collapsed state
	 */
	boolean isCollapsed();
	
	/**
	 * Returns <code>true</code> if the panel is expanded.
	 * @return the expand state
	 */
	boolean isExpanded();
	
	/**
	 * Returns true if the footer is enabled.
	 * @return the show footer state
	 */
	boolean isFooter();
	
	/**
	 * Returns true if the header is visible.
	 * @return the header visible state
	 */
	boolean isHeaderVisible();
	
	/**
	 * Returns true if the collapse tool is hidden.
	 * @return the hide collapse tool state
	 */
	boolean isHideCollapseTool();
	
	void onComponentEvent( ComponentEvent ce );
	
	/**
	 * Sets whether expand and collapse is animating (defaults to true, pre-render).
	 * @param animCollapse true to enable animations
	 */
	void setAnimCollapse( boolean animCollapse );
	
	/**
	 * True to display the borders of the panel's body element, false to hide them (defaults to true, pre-render). Only applies to non-framed panels.
	 * @param bodyBorder true for a body border
	 */
	void setBodyBorder( boolean bodyBorder );
	
	/**
	 * Custom CSS styles to be applied to the body element in the format expected by {@link El#applyStyles} (pre-render).
	 * @param bodyStyle the body style
	 */
	void setBodyStyle( String bodyStyle );
	
	/**
	 * A style name that is added to the panel's body element (pre-render).
	 * @param style the style name
	 */
	void setBodyStyleName( String style );
	
	/**
	 * Sets the panel's bottom component (pre-render). The component's natural height will be used and will not be changed by the panel.
	 * @param bottomComponent the bottom component
	 */
	void setBottomComponent( Component bottomComponent );
	
	/**
	 * Sets the button alignment of any buttons added to this panel (defaults to RIGHT, pre-render).
	 * @param buttonAlign the button alignment
	 */
	void setButtonAlign( HorizontalAlignment buttonAlign );
	
	/**
	 * True to make the panel collapsible and have the expand/collapse toggle button automatically rendered into the header tool button area, false to keep the panel statically sized with no button (defaults to false, pre-render).
	 * @param collapsible the collapsible to set
	 */
	void setCollapsible( boolean collapsible );
	
	/**
	 * Sets the panel's expand state.
	 * @param expanded <code>true<code> true to expand
	 */
	void setExpanded( boolean expanded );
	
	/**
	 * True to create the footer element explicitly, false to skip creating it (pre-render). By default, when footer is not specified, if one or more buttons have been added to the panel the footer will be created automatically, otherwise it will
	 * not.
	 * @param footer the footer state
	 */
	void setFooter( boolean footer );
	
	/**
	 * True to render the panel with custom rounded borders, false to render with plain 1px square borders (defaults to false, pre-render).
	 * @param frame true to use the frame style
	 */
	void setFrame( boolean frame );
	
	/**
	 * True to create the header element explicitly, false to skip creating it (defaults to true, pre-render). By default, when header is not specified, if a {@link #setHeading(String)} is set the header will be created automatically, otherwise it
	 * will not. If a title is set but header is explicitly set to false, the header will not be rendered.
	 * @param headerVisible true to show the header
	 */
	void setHeaderVisible( boolean headerVisible );
	
	/**
	 * Sets the title text for the panel.
	 * @param text the title text
	 */
	void setHeading( String text );
	
	/**
	 * Sets whether the collapse tool should be displayed when the panel is collapsible.
	 * @param hideCollapseTool true if the tool is hidden
	 */
	void setHideCollapseTool( boolean hideCollapseTool );

	/**
	 * True to display an interior border on the body element of the panel, false to hide it (defaults to true, pre-render). This only applies when {@link #setBodyBorder(boolean)} == true.
	 * @param insetBorder true to display the interior border
	 * @deprecated behavior not implemented
	 */
	@Deprecated
	void setInsetBorder( boolean insetBorder );
	
	void setMinButtonWidth( int minButtonWidth );
	
	/**
	 * True to allow expanding and collapsing the panel (when {@link #collapsible} = true) by clicking anywhere in the header bar, false to allow it only by clicking to tool button (defaults to false, pre-render).
	 * @param titleCollapse the titleCollapse to set
	 */
	void setTitleCollapse( boolean titleCollapse );
	
	/**
	 * Sets the panel's top component (pre-render).
	 * @param topComponent the component
	 */
	void setTopComponent( Component topComponent );
	
	/**
	 * Adds the content from the given url.
	 * @param url the url
	 * @return the new frame instance
	 */
	Frame setUrl( String url );

}
