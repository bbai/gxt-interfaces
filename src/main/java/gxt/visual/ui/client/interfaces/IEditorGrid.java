package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IEditorGridPresenter;
import gxt.visual.ui.client.interfaces.view.IEditorGridView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;

/**
 * @author eugenp
 */
public interface IEditorGrid< M extends ModelData > extends IGrid< M >, IEditorGridView< M >, IEditorGridPresenter< M >{
	
	/** mine */
	EditorGrid< M > getComponent();

}
