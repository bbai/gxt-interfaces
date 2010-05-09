package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.HtmlContainer;

import gxt.visual.interfaces.presenter.IHtmlContainerPresenter;
import gxt.visual.interfaces.view.IHtmlContainerView;

/**
 * @author eugenp
 */
public interface IHtmlContainer extends IContainer< Component >, IHtmlContainerView, IHtmlContainerPresenter{
	
	/** mine */
	HtmlContainer getComponent();

}
