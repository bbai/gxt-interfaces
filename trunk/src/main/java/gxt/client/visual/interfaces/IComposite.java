package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Composite;

import gxt.client.visual.interfaces.presenter.ICompositePresenter;
import gxt.client.visual.interfaces.view.ICompositeView;

/**
 * @author eugenp
 */
public interface IComposite extends IBoxComponent, ICompositeView, ICompositePresenter{
	
	/** mine */
	Composite getComponent();
	
}
