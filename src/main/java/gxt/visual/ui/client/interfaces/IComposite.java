package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Composite;

import gxt.visual.ui.client.interfaces.presenter.ICompositePresenter;
import gxt.visual.ui.client.interfaces.view.ICompositeView;

/**
 * @author eugenp
 */
public interface IComposite extends IBoxComponent, ICompositeView, ICompositePresenter{
	
	/** mine */
	Composite getComponent();
	
}
