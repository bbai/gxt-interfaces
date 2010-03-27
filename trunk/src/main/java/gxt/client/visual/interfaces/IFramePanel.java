package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IFramePanelPresenter;
import gxt.client.visual.interfaces.view.IFramePanelView;

import com.extjs.gxt.ui.client.widget.FramePanel;

/**
 * Note: not in use (FramePanel has a private constructor, thus it cannot be extended)
 * @author eugenp
 */
public interface IFramePanel extends IComponent, IFramePanelView, IFramePanelPresenter{
	
	/** mine */
	FramePanel getComponent();

}
