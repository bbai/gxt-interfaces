package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.ProgressBar;

import gxt.visual.interfaces.presenter.IProgressBarPresenter;
import gxt.visual.interfaces.view.IProgressBarView;

/**
 * @author eugenp
 */
public interface IProgressBar extends IBoxComponent, IProgressBarView, IProgressBarPresenter{
	
	/** mine */
	ProgressBar getComponent();

}
