package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IComponentPresenter;
import gxt.visual.interfaces.view.IComponentView;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * @author eugenp
 */
public interface IComponent extends IComponentView, IComponentPresenter{

	/** mine */
	Component getComponent();

}
