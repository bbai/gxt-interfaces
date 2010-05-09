package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IBoxComponentPresenter;
import gxt.visual.ui.client.interfaces.view.IBoxComponentView;

import com.extjs.gxt.ui.client.widget.BoxComponent;

/**
 * @author eugenp
 */
public interface IBoxComponent extends IComponent, IBoxComponentView, IBoxComponentPresenter{
	
	/** mine */
	BoxComponent getComponent();
	
}
