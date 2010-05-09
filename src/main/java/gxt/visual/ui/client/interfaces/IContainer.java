package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IContainerPresenter;
import gxt.visual.ui.client.interfaces.view.IContainerView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Container;

/**
 * @author eugenp
 */
public interface IContainer< T extends Component > extends IBoxComponent, IContainerView< T >, IContainerPresenter< T >{
	
	/** mine */
	Container< T > getComponent();

}
