package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IListViewPresenter;
import gxt.visual.interfaces.view.IListViewView;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.widget.ListView;

/**
 * @author eugenp
 */
public interface IListView< M extends ModelData > extends IBoxComponent, IListViewView< M >, IListViewPresenter< M >{
	
	/** mine */
	ListView< M > getComponent();
	
}
