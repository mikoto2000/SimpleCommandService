package jp.dip.oyasirazu.service;

import jp.dip.oyasirazu.simplecommand.command.Command;
import jp.dip.oyasirazu.simplecommand.command.CommandException;

/**
 * コマンドラインの実行結果を返すサービス
 */
public class SimpleCommandService {
    /**
     * pandoc を実行し、実行結果を取得する。
     * @param args pandoc のコマンドライン引数
     * @param input pandoc への標準入力
     * @return pandoc の実行結果。コマンドの実行で例外が発生した場合には null が返る。
     */
    public String pandoc(String[] args, String input) {
        Command pandoc = new Command("pandoc");
        pandoc.setArgs(args);
        String result;
        try {
            result = pandoc.execute(input);
            return result;
        } catch (CommandException e) {
            e.printStackTrace();
            return null;
        }
    }
}
