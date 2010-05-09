package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.HtmlContainer;

import gxt.visual.ui.client.interfaces.presenter.IHtmlContainerPresenter;
import gxt.visual.ui.client.interfaces.view.IHtmlContainerView;

/**
 * @author eugenp
 */
public interface IHtmlContainer extends IContainer< Component >, IHtmlContainerView, IHtmlContainerPresenter{
	
	/** mine */
	HtmlContainer getComponent();

}
