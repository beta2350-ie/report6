これはサッカーのPKを再現したゲームです。以下に説明をします。
 - このゲームにはPVP(対人戦)とPVE(対コンピュータ戦)の二つのモードがあります。
 - 表示される文字に従い、対人戦の場合は0、対コンピュータ戦の場合は1を入力してください。
 - どちらのモードを選んでも自分と相手の名前は自由に決めることができます。好きな名前を入れてください。
//-------
//|1|2|3|
//|4|5|6|
//-------
 - ボードはこのような形になっています。表示される指示に従い１〜６までの数字を入力してください。
 - このゲームは１試合5セットになっています。自分がシュートとキーパーを1回づつやれば１セットです。
最後に
これは*半角*で入力してください。

ユニットテストについて
 - ユニットテストはshootPositionメソッドをテストしている。
 - 1つ目のif文はshootとkeepが同じ、つまりキーパーが止めた場合はscoreが増えてないことを示している。
 - 2つ目と3つ目のif文はshootとkeepが違う、つまりキーパーが止められなかった場合はscoreが増えていることを示している。
 - これらより、このメソッドは正常に動作していることを示している。