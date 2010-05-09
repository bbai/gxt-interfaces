package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IComponentPresenter;
import gxt.visual.ui.client.interfaces.view.IComponentView;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IComponent extends IComponentView, IComponentPresenter{

	/** mine */
	Component getComponent();

}
