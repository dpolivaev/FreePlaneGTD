// @ExecutionModes({on_single_node="main_menu_scripting/freeplaneGTD[addons.editAction]"})
//=========================================================
// Freeplane GTD+
//
// Copyright (c)2014 Gergely Papp
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//=========================================================
import freeplaneGTD.editor.ActionEditor
import freeplaneGTD.editor.MultinodeActionEditor
import org.freeplane.core.ui.components.UITools

import org.freeplane.plugin.script.proxy.Proxy

List<Proxy.Node> selecteds = c.getSelecteds()
if (selecteds.size()==1) {
    ActionEditor editor = new ActionEditor()
    editor.editNode(node)
} else if(selecteds.size()>1) {
    MultinodeActionEditor editor = new MultinodeActionEditor()
    editor.editNodes(selecteds)
} else {
    UITools.informationMessage("Nothing selected")
}
