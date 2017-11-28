window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Livro = window.blockly.js.blockly.Livro || {};

/**
 * Livro
 */
window.blockly.js.blockly.Livro.converteMaiuscula = function() {
	this.cronapi.screen.changeValueOfField("Livro.active.titulo",
			this.cronapi.screen.getValueOfField("Livro.active.titulo")
					.toUpperCase());
}
