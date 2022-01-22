package net.badbird5907.blib.util;

import net.md_5.bungee.api.ChatColor;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static net.md_5.bungee.api.ChatColor.*;

public final class CC {
	public static final String WHITE = ChatColor.WHITE.toString();
	public static final String GREEN = ChatColor.GREEN.toString();
	public static final String D_GREEN = DARK_GREEN.toString();
	public static final String D_BLUE = DARK_BLUE.toString();
	public static final String RED = ChatColor.RED.toString();
	public static final String D_RED = DARK_RED.toString();
	public static final String GRAY = ChatColor.GRAY.toString();
	public static final String D_GRAY = DARK_GRAY.toString();
	public static final String YELLOW = ChatColor.YELLOW.toString();
	public static final String GOLD = ChatColor.GOLD.toString();
	public static final String AQUA = ChatColor.AQUA.toString();
	public static final String D_AQUA = DARK_AQUA.toString();
	public static final String BLUE = ChatColor.BLUE.toString();
	public static final String PINK = LIGHT_PURPLE.toString();
	public static final String PURPLE = DARK_PURPLE.toString();
	public static final String BLACK = ChatColor.BLACK.toString();
	public static final String B = ChatColor.BOLD.toString();
	public static final String I = ChatColor.ITALIC.toString();
	public static final String U = ChatColor.UNDERLINE.toString();
	public static final String S = ChatColor.STRIKETHROUGH.toString();
	public static final String R = ChatColor.RESET.toString();
	public static final String BOLD = ChatColor.BOLD.toString();
	public static final String ITALIC = ChatColor.ITALIC.toString();
	public static final String UNDERLINE = ChatColor.UNDERLINE.toString();
	public static final String STRIKETHROUGH = ChatColor.STRIKETHROUGH.toString();
	public static final String RESET = ChatColor.RESET.toString();
	public static final String PRIMARY = ChatColor.AQUA.toString();
	public static final String SECONDARY = LIGHT_PURPLE.toString();
	public static final String ACCENT = DARK_AQUA.toString();
	public static final String SPLITTER = "┃";
	public static final String SCOREBOARD_SEPARATOR = GRAY + S + "--------------------";
	public static final String SCOREBOARD_IP_SEPARATOR = GRAY + S + "---";
	public static final String SEPARATOR = GRAY + S + "-------------------------------------";
	public static final String BULLET = "•";
	public static final String NEWLINE = "\n";
	public static final String NL = "\n";
	public static final String ARROW_RIGHT = "»";
	public static final String ARROW_LEFT = "«";
	public static final String X = "✘";
	public static final String CHECK = "\u2714";
	public static final String SELECTOR_ARROW = "\u25b8";

	private CC() {
		throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
	}

	public static String translate(String in) {
		return translateAlternateColorCodes('&', in);
	}

	public static List<String> translate(List<String> input) {
		return input.stream().map(CC::translate).collect(toList());
	}

	public static String strip(String in) {
		return stripColor(in);
	}
}
