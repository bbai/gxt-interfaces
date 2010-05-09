package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Composite;

import gxt.visual.interfaces.presenter.ICompositePresenter;
import gxt.visual.interfaces.view.ICompositeView;

/**
 * @author eugenp
 */
public interface IComposite extends IBoxComponent, ICompositeView, ICompositePresenter{
	
	/** mine */
	Composite getComponent();
	
}
