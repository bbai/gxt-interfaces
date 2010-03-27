package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IComponentPresenter;
import gxt.client.visual.interfaces.view.IComponentView;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IComponent extends IComponentView, IComponentPresenter{

	/** mine */
	Component getComponent();

}
