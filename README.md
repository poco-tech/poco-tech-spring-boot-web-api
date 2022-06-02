# Web API 開発入門：Spring Boot と OpenAPI で始めるスキーマ駆動開発

## コミット一覧

### はじめに

- [Spring Initializr で Spring Boot プロジェクトの雛形を作成しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/97ae527983bc60b1377f46f7087b0958796582b7)

### スキーマ駆動開発の準備をしよう

- [スキーマファイルを作成しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3e8527929c5e5faf264cb1748e8d63f4c48fc580)
- [OpenAPI Generator Gradle Plugin を導入しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3fb8d00434e32981eb2442028aa658916f4a88f4)
- [スキーマからAPI ドキュメントを生成しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/2f9f02d702eaaafa3ea958aa6564e3a64323b610)
- [スキーマから Spring のコードを生成しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/0369eda6abde51ad5d443456adf712660e8826a1)
- [Gradleタスクの依存関係を設定しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/34785c52e5a9f0011975d4ab46b58dd9b5f69b04)
- [生成したコードをインポートできるようにしよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/278b39c89e00f3c765b72357c1e15d2c05f8570e)
- [起動に必要なライブラリを追加しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/74ca386bf04a05313a0bc9ca4701b59321f2eb5b)
- [ヘルスチェックAPIを実装してみよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/85adb520429a935a63f6fb94d4edae431b1b534c)

### APIを設計しよう

- （コードの変更なし）

### Spring Boot の基礎

- [RestController を作ろう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/b30464e5fec7a4d8f8003ad07a5afde7958ec05d)
- [レスポンスボディ用の DTO を作ろう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/81210e00959821395cb2ea144542e2c6ebfc101b)
- [Lombok を使ってボイラープレートコードを減らそう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/16d34e528ab0a10833ac578f35e0905521d557ef)
- [Service と Entity を作ろう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/f9e11d791844e9f1b6741719c1be06466db25ab9)
- [Dependency Injection を使ってみよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/9db7d8c1cd0b7ed454605619b043f939e787088e)
- [Repository と Record を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/ee42eca3c035d6857c9f6b0ecbd9816c28bb8430)
- [データベースを導入しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/c0e340c01206bfb6e71440bd1e4c2f6a7e8a6d59)
- [schema.sql を用意してテーブルを作成しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/2dc62a8629671d3ec24735065195a771fe605d8f)
- [data.sql を用意してテーブルにデータを投入しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/60521d4d1e807b01f7e40cb8f9080a8bdcc004d6)
- [MyBatis を使ってデータベースにアクセスしよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/1c4af218d7fc3f40dc78722d6d7a5d391eb144c1)

### タスク取得APIを実装しよう

- [/tasks/1 (empty response body)：スキーマを定義しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3272f283d07f80a3554ad794036c965a9aa8bf8a)
- [/tasks/1 (empty response body)：tag を使ってスキーマを整理しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/6554a9af63a665829fc9773eab2a3cb0a43d4cfd)
- [/tasks/1 (empty response body)：Controller を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/95eb712110ca272d607b5750b3b7fd930fb36f1d)
- [/tasks/1 (empty response body)：自動生成されるメソッドのリファクタリングをしよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/7c8ad07e8cf4d1bc2408a376ea127fa4a0dc9ff4)
- [/tasks/1：レスポンスボディのスキーマを定義しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/fcbef8073c1cd4353ddff7387f302d9f695be635)
- [/tasks/1：Controller を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/fb9523322843f53760252998a4393e53233ef646)
- [/tasks/1：Service を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/75b6520e7d3928254ebb9f2eac8ca235cd9a2b0b)
- [schema.sql にタスクテーブルを定義しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/68f690a175a46ec68fb7b09c754db16ce74013b8)
- [data.sql でタスクテーブルにデータを投入しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3a2eb2abdf9fdd49450f56815b38aeb9ca4f77ca)
- [/tasks/1：Repository を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/f0778a31914cf30906968510e2e733c532361d34)
- [/tasks/{taskId}：スキーマを定義しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/7e640542d9fc3347d487f1df12c035637196e406)
- [/tasks/{taskId}：Controller / Service / Repository を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/610a075e00ab074bafd49c57c9d906624c44906a)
- [404 レスポンス：スキーマを定義しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3a8aba15f2f69c4eb6ba0fbf85382c4e37b3a36c)
- [404 レスポンス：独自例外を実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/dd04353ca8af82f7e65314d9995ed368d1c3f35a)
- [404 レスポンス：独自例外を処理するハンドラーを実装しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/e5f33b30b5f47fc5047a3e6d5a5a629e340f965f)
- [404 レスポンス：ボディのスキーマを定義しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/bf5b6a5530be4440dc76639ce18a29a6bb572827)
- [404 レスポンス：ボディを返すようにハンドラーを変更しよう](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3fe523de150178335a8a502cb8db70ea901cb513)

### タスク作成APIを実装しよう

- [POST されたら 201 を返す：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/0ce85757025a7b7067eacb32e82fa22baba0254a)
- [POST されたら 201 を返す：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/e44e91a96692e2deea0e365ddcc3d174c5ca0763)
- [レスポンスボディ：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/9dad8c5d913d3384c6ff5d9261c8b7fddff2b69c)
- [レスポンスボディ：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/90d2a1b24608ec9477e317601f821d042e06b998)
- [リクエストボディ：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/4cadfc00da396c0181cf98fa73ba39a7d001f5b4)
- [リクエストボディ：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/ce48fdb561eacb0f5c6a21e2f1503fadc98a396f)
- [リクエストボディ：Service](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/fa51bbe212b9601ccaa6affc62b5c3d318561590)
- [リクエストボディ：Repository](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/0185fe833b68a0f4146e4ffff519f85e8893951f)
- [レスポンスヘッダ：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/8657542eb3c81d24efd60d92b6ce8f434fd8e377)
- [レスポンスヘッダ：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/a89cd6c69cf6f1231c0003f17ad5999794d54f24)
- [400 Bad Request（フィールド欠損）：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/f48a368502017cd4d74ab9fb86fb30f35bf122ea)
- [400 Bad Request（フィールド欠損）：例外ハンドラー実装](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/564f6d2d8509266d67f917cf45c4d1d87295f809)
- [400 Bad Request（フィールド欠損）：不正なフィールドの情報を詰める](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/f527f5bb9d154f7f05a998c8e805335e30da3cac)
- [400 Bad Request（フィールド欠損）：リファクタリング](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/2d5d610718505d1244a691cf5a87e98ca02c9051)
- [400 Bad Request（文字長制限）：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/06e74dd10f5940fca1b403690db0a10984453c90)

### タスク一覧APIを実装しよう

- [エンドポイント作成：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/e7cc2a4d29abafbd3322759edceada12f961162c)
- [エンドポイント作成；Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/6ca0c8ebd430c60af3cc4aa6494a67453c434f86)
- [200 レスポンス（Taskリソース）：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/b17f76f22660ddd3654a6a25f3ebbe328f744d88)
- [200 レスポンス（Taskリソース）：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/745a2c9b4ee44a9d20087f64c8bd890e471ab1ce)
- [200 レスポンス（Taskリソース）：Service](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/03bbc43ba7aa30b5c5bcd48e8579fa3d9130fb15)
- [200 レスポンス（Taskリソース）：Controller のリファクタリング](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/36f61389392008a670ca01ab8b781478f023271c)
- [200 レスポンス（Taskリソース）：Repository](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/4447fd237be25dd349edad0133a170ed7d9c0b0f)
- [リクエスト（limit/offset）：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/7352c3b8506be5fa9b482af19463b2596fb3ce33)
- [リクエスト（limit/offset）：API 実装](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/c295bddbd0177550645ddd3e2ef8dcc95e012ac4)
- [200 レスポンス（ページネーション）：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/e92672cad7430e79966878bb4d22b141047165b5)
- [201 レスポンス（ページネーション）：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/c580780ce5654d00ad027ef1684d16bfed816240)
- [400 Bad Request：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/50376a97b84adf7e2204448c1277c626cb492622)
- [400 Bad Request：例外ハンドラー実装](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/3f12665a1f61c07959aa7028a2d9abf7f3b97afc)
- [400 Bad Request：不正なフィールドの情報を詰める](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/4e8b37c617fe4d26b194034a594b3d1149dac050)
- [400 Bad Request：リファクタリング](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/984d7dfcc951c6603faa10c7d7ed6ad175fd11f1)

### タスク更新APIを実装しよう

- [エンドポイント作成：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/8254e070587309419a34a5d226272beadf82d36f)
- [エンドポイント作成：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/c8f38e52cc67ef32b12782bf22b3d56b8544d502)
- [200 レスポンス：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/e8d856afbf8e2709e6734d73e05b3ee298ef9b21)
- [200 レスポンス：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/ed3b383e43179db11c6929d4874e5c62751e4dc9)
- [リクエストボディ：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/1033d18e4a23ff5e03cb2f688513570deb65a84b)
- [リクエストボディ：API実装](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/2951874da8d7e8f38e7f181084b6cb1cecb39535)
- [400 Bad Request: スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/2d3db19da47818cfaef035c229b368d002ff3ed3)
- [404 Not Found：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/8cd5c28bc25fd673fa627fff65bc0d157f855355)
- [404 Not Found：Service](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/94918efcf82891a3d5097e9c8a8c67a9e23b48c4)

### タスク削除APIを実装しよう

- [200 No Content：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/87f63cfe4d7193a8cd30860fe9b2d1ad0345884c)
- [204 No Content：Controller](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/cf4259b3be8418fcdf1409df579ce523bdb19563)
- [204 No Content：Service + Repository](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/22887f15d2fd54222cddcda8339386dc41539289)
- [404 Not Found：スキーマ](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/112623451aca1944065d38d4c920dbf81b7c23ae)
- [404 Not Found：Service](https://github.com/poco-tech/poco-tech-spring-boot-web-api/commit/6f86c44bc333e47dfda83d27a58be1d33b8f5fa6)

### おわりに

- （コードの変更なし）
