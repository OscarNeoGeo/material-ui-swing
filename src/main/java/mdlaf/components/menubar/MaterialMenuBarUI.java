/**
 * MIT License
 *
 * Copyright (c) 2018-2020 atharva washimkar, Vincenzo Palazzo vincenzopalazzo1996@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mdlaf.components.menubar;

import mdlaf.utils.MaterialDrawingUtils;

import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuBarUI;
import javax.swing.plaf.metal.MetalMenuBarUI;
import java.awt.*;

/**
 * @author https://github.com/vincenzopalazzo
 * @author https://github.com/atarw
 */
public class MaterialMenuBarUI extends BasicMenuBarUI {

	public static ComponentUI createUI (JComponent c) {
		return new MaterialMenuBarUI ();
	}

	@Override
	public void installUI (JComponent c) {
		super.installUI (c);

		//JMenuBar menuBar = (JMenuBar) c;
		//menuBar.setFont (UIManager.getFont ("MenuBar.font"));
		//menuBar.setBackground (UIManager.getColor ("MenuBar.background"));
		//menuBar.setForeground (UIManager.getColor ("MenuBar.foreground"));
		//menuBar.setBorder (UIManager.getBorder ("MenuBar.border"));
	}

	@Override
	public void uninstallUI(JComponent c) {
		JMenuBar menuBar = (JMenuBar) c;
		menuBar.setFont (null);
		menuBar.setBackground (null);
		menuBar.setBorder (null);
		menuBar.setForeground (null);

		super.uninstallUI(c);
	}

	@Override
	public void paint (Graphics g, JComponent c) {
		super.paint (MaterialDrawingUtils.getAliasedGraphics (g), c);
	}
}
