package gxt.visual.ui.client.interfaces.view;

/**
 * A LayoutContainer that fills the browser window and monitors window resizing. Viewports are best used for applications that will fill the browser without window scrolling. Children of the viewport can allow scrolling.</p> Code snippet:
 * 
 * <pre>
 * Viewport viewport = new Viewport();
 * viewport.add( new ContentPanel(), new MarginData( 10 ) );
 * RootPanel.get().add( viewport );
 * </pre>
 * <p/>
 * The viewport is not added to the root panel automatically. Is is not necessary to call {@link #layout()} after adding the viewport to the RootPanel. Layout will be called after being added to the root panel.
 * <dl>
 * <dt>Inherited Events:</dt>
 * <dd>LayoutContainer AfterLayout</dt>
 * <dd>ScrollContainer Scroll</dd>
 * <dd>Container BeforeAdd</dd>
 * <dd>Container Add</dd>
 * <dd>Container BeforeRemove</dd>
 * <dd>Container Remove</dd>
 * <dd>BoxComponent Move</dd>
 * <dd>BoxComponent Resize</dd>
 * <dd>Component Enable</dd>
 * <dd>Component Disable</dd>
 * <dd>Component BeforeHide</dd>
 * <dd>Component Hide</dd>
 * <dd>Component BeforeShow</dd>
 * <dd>Component Show</dd>
 * <dd>Component Attach</dd>
 * <dd>Component Detach</dd>
 * <dd>Component BeforeRender</dd>
 * <dd>Component Render</dd>
 * <dd>Component BrowserEvent</dd>
 * <dd>Component BeforeStateRestore</dd>
 * <dd>Component StateRestore</dd>
 * <dd>Component BeforeStateSave</dd>
 * <dd>Component SaveState</dd>
 * </dl>
 * @author ADaroussin
 */
public interface IViewportView extends ILayoutContainerView{
	/**
	 * Returns the window resizing state.
	 * @return true if window scrolling is enabled
	 */
	public boolean getEnableScroll();

	/**
	 * The loading panel id.
	 * @return the id
	 */
	public String getLoadingPanelId();

	public void onAttach();

	/**
	 * Sets whether window scrolling is enabled.
	 * @param enableScroll the window scroll state
	 */
	public void setEnableScroll( boolean enableScroll );

	/**
	 * The element id of the loading panel which will be hidden when the viewport is attached (defaults to 'loading').
	 * @param loadingPanelId the loading panel element id
	 */
	public void setLoadingPanelId( String loadingPanelId );
}
