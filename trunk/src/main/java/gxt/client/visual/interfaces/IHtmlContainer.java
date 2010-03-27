package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.HtmlContainer;

import gxt.client.visual.interfaces.presenter.IHtmlContainerPresenter;
import gxt.client.visual.interfaces.view.IHtmlContainerView;

/**
 * @author eugenp
 */
public interface IHtmlContainer extends IContainer< Component >, IHtmlContainerView, IHtmlContainerPresenter{
	
	/** mine */
	HtmlContainer getComponent();

}
