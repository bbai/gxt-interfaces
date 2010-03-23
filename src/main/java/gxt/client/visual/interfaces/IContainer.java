package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IContainerPresenter;
import gxt.client.visual.interfaces.view.IContainerView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Container;

/**
 * @author eugenp
 */
public interface IContainer< T extends Component > extends IBoxComponent, IContainerView< T >, IContainerPresenter< T >{
	
	/** mine */
	Container< T > getComponent();

}
