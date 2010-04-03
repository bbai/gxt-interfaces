package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Html;

import gxt.client.visual.interfaces.presenter.IHtmlPresenter;
import gxt.client.visual.interfaces.view.IHtmlView;

/**
 * @author eugenp
 */
public interface IHtml extends IBoxComponent, IHtmlView, IHtmlPresenter{
	
	/** mine */
	Html getComponent();

}
