package gxt.visual.ui.client.interfaces.view;

import com.extjs.gxt.ui.client.widget.form.Field;
import com.extjs.gxt.ui.client.widget.form.HtmlEditor.HtmlEditorImages;
import com.extjs.gxt.ui.client.widget.form.HtmlEditor.HtmlEditorMessages;
import com.google.gwt.user.client.ui.RichTextArea.BasicFormatter;
import com.google.gwt.user.client.ui.RichTextArea.ExtendedFormatter;

/**
 * Provides a lightweight HTML Editor component.
 * <p />
 * <b>Note: The focus/blur and validation marking functionality inherited from {@link Field} is NOT supported by this editor.</b>
 * <p />
 * An Editor is a sensitive component that can't be used in all spots standard fields can be used. Putting an Editor within any element that has display set to 'none' can cause problems in Safari and Firefox due to their default iframe reloading
 * bugs.
 * <dl>
 * <dt>Events:</dt>
 * <dd><b>BeforeSync</b> : HtmlEditorEvent(htmlEditor, change)<br>
 * <div>Fires before the iframe editor is updated with content from the textarea.</div>
 * <ul>
 * <li>htmlEditor : this</li>
 * <li>change : true for edit mode</li>
 * </ul>
 * </dd>
 * <dd><b>Sync</b> : HtmlEditorEvent(htmlEditor, change)<br>
 * <div>Fires when the iframe editor is updated with content from the textarea.</div>
 * <ul>
 * <li>htmlEditor : this</li>
 * <li>change : true for edit mode</li>
 * </ul>
 * </dd>
 * <dd><b>EditModeChange</b> : HtmlEditorEvent(htmlEditor, change)<br>
 * <div>Fires when the editor switches edit modes.</div>
 * <ul>
 * <li>htmlEditor : this</li>
 * <li>change : true for edit mode</li>
 * </ul>
 * </dd>
 * </dl>
 * @author ADaroussin
 */
@SuppressWarnings( "deprecation" )
public interface IHtmlEditorView extends IFieldView< String >{

	public void blur();

	public void focus();

	/**
	 * Gets the basic rich text formatting interface.
	 * @return <code>null</code> if basic formatting is not supported
	 */
	public BasicFormatter getBasicFormatter();

	/**
	 * Gets the full rich text formatting interface.
	 * @return <code>null</code> if full formatting is not supported
	 */
	public ExtendedFormatter getExtendedFormatter();

	public HtmlEditorMessages getMessages();

	public String getRawValue();

	public HtmlEditorImages getImages();

	public boolean isEnableAlignments();

	public boolean isEnableColors();

	public boolean isEnableFont();

	public boolean isEnableFontSize();

	public boolean isEnableFormat();

	public boolean isEnableLinks();

	public boolean isEnableLists();

	public boolean isShowToolbar();

	public boolean isSourceEditMode();

	public void pushValue();
	
	public void setEnableAlignments( boolean enableAlignments );
	
	public void setEnableColors( boolean enableColors );
	
	public void setEnableFont( boolean enableFont );
	
	public void setEnableFontSize( boolean enableFontSize );
	
	public void setEnableFormat( boolean enableFormat );
	
	public void setEnableLinks( boolean enableLinks );
	
	public void setEnableLists( boolean enableLists );
	
	public void setRawValue( String value );
	
	public void setShowToolbar( boolean showToolbar );
	
	public void setSourceEditMode( boolean mode );
	
	public void setValue( String value );

	public void syncValue();
	
	public boolean validate( boolean silent );
	
}
