package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IBoxComponentPresenter;
import gxt.visual.interfaces.view.IBoxComponentView;

import com.extjs.gxt.ui.client.widget.BoxComponent;

/**
 * @author eugenp
 */
public interface IBoxComponent extends IComponent, IBoxComponentView, IBoxComponentPresenter{
	
	/** mine */
	BoxComponent getComponent();
	
}
