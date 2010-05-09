package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.Html;

import gxt.visual.ui.client.interfaces.presenter.IHtmlPresenter;
import gxt.visual.ui.client.interfaces.view.IHtmlView;

/**
 * @author eugenp
 */
public interface IHtml extends IBoxComponent, IHtmlView, IHtmlPresenter{
	
	/** mine */
	Html getComponent();

}
