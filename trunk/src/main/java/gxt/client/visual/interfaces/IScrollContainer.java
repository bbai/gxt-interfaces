package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IScrollContainerPresenter;
import gxt.client.visual.interfaces.view.IScrollContainerView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ScrollContainer;

/**
 * @author eugenp
 */
public interface IScrollContainer< T extends Component > extends IContainer< T >, IScrollContainerView< T >, IScrollContainerPresenter< T >{
	
	/** mine */
	ScrollContainer< T > getComponent();

}
