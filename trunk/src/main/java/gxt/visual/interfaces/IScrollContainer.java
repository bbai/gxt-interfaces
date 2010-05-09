package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IScrollContainerPresenter;
import gxt.visual.interfaces.view.IScrollContainerView;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.ScrollContainer;

/**
 * @author eugenp
 */
public interface IScrollContainer< T extends Component > extends IContainer< T >, IScrollContainerView< T >, IScrollContainerPresenter< T >{
	
	/** mine */
	ScrollContainer< T > getComponent();

}
