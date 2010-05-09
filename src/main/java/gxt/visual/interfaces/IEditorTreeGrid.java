package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IEditorTreeGridPresenter;
import gxt.visual.interfaces.view.IEditorTreeGridView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGrid;

/**
 * @author eugenp
 */
public interface IEditorTreeGrid< M extends ModelData > extends ITreeGrid< M >, IEditorTreeGridView< M >, IEditorTreeGridPresenter< M >{
	
	/** mine */
	TreeGrid< M > getComponent();

}
