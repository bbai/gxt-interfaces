package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Editor;

import gxt.visual.interfaces.presenter.IEditorPresenter;
import gxt.visual.interfaces.view.IEditorView;

/**
 * @author eugenp
 */
public interface IEditor extends IBoxComponent, IEditorView, IEditorPresenter{
	
	/** mine */
	Editor getComponent();

}
