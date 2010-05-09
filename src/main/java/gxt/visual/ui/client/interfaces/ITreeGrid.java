package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ITreeGridPresenter;
import gxt.visual.ui.client.interfaces.view.ITreeGridView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.treegrid.TreeGrid;

/**
 * @author eugenp
 */
public interface ITreeGrid< M extends ModelData > extends IGrid< M >, ITreeGridView< M >, ITreeGridPresenter< M >{
	
	/** mine */
	TreeGrid< M > getComponent();

}
