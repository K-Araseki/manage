# 初期設定（環境構築）
参考　https://github.com/gishi-yama/wicket_spring-boot_practice  
spring ~ wicketの設定
動作確認済み 

# 開発を行う前に（基本的なgitコマンドの使い方）
毎回修正内容をローカルに反映する  
git pull origin master  
  
修正したファイルをアップする  
git add .  
git commit -m "変更内容"  
git push  
  
コンフリクトが発生した場合はグループで共有する
※後にブランチを切り離して開発する可能性あり

# READMEの編集方法
見出し ： # 見出し(#の数に応じて大きさが変化)　※#の後に空白  
改行 ： 2マス空白 or ＜br＞を挿入  
文章にリンク添付 ： [文章]（URL）  
  
画像の挿入 ： ![タイトル](URL)    
imagesフォルダを追加してあるのでその中に画像を保存する（初回のpullでフォルダが自動生成されるはず）   
以下、保存方法  
＜方法1＞git bash    
ローカルのmanage/imagesの中に挿入したい画像を保存  
git add .  
git commit -m ""  
git push  
のいつもの流れで反映する  
＜方法2＞　github  
github上でimagesを開きadd fileから写真を保存  
  
※URLはgit hub上で入手する（images/~でもOK!）  


# 各ページの作成
以前作成した画面遷移図を参考にページを作成する  
※権限付与されたアカウントから開く  
[講師ページ](https://drive.google.com/file/d/1av83fLOI032JiPmCQgk8fPDk39uY5pUZ/view?usp=sharing)  
[生徒ページ](https://drive.google.com/file/d/1c8PDJIs3UcxunowEDhWiSyd2W1Ew4AHD/view?usp=sharing)  
  
デザインを行っていくうえで適宜.cssまたは.jsを切り離す  
※まずは.html内にべた書き  
  
残りは講師ページ　←　優先

# データベースの設定  
  
# 開発の流れ  
まずは講師側から手を付ける
