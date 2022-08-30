{ pkgs }: {
	deps = [
  pkgs.run
  pkgs.vimHugeX
  pkgs.verilog
		pkgs.gtkwave
        pkgs.wmctrl
        pkgs.gnome.adwaita-icon-theme
	];
    env = {
        XDG_DATA_DIRS="$XDG_DATA_DIRS${pkgs.gnome.adwaita-icon-theme}/share:";
    };
}
