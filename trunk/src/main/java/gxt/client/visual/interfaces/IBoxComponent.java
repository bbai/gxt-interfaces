package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IBoxComponentPresenter;
import gxt.client.visual.interfaces.view.IBoxComponentView;

import com.extjs.gxt.ui.client.widget.BoxComponent;

public interface IBoxComponent extends IComponent, IBoxComponentView, IBoxComponentPresenter{

	/** mine */
	BoxComponent getComponent();

}