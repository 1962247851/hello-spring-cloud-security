# Hello Spring Cloud Security
修改自 [spring-authorization-server](https://github.com/spring-projects/spring-authorization-server)

修改内容：
1. 修改JWK源


步骤：
1. 初始化数据库sql/hello_spring_cloud_security.sql
2. 避免跨域cookie时效，在host添加 127.0.0.1 auth-server 
3. 运行authorization-server
4. 运行resource-server
5. 运行client
6. 访问[http://127.0.0.1:8080](http://127.0.0.1:8080)

# 可能用到的链接
1. [simple JSON Web Key generator](https://mkjwk.org/)
2. [rfc6749 - The OAuth 2.0 Authorization Framework](https://datatracker.ietf.org/doc/html/rfc6749)

# Authorization Server
## 获取Token
1. client_credentials

POST http://localhost:9302/oauth2/token?grant_type=client_credentials&client_id=messaging-client&client_secret=secret&scope=openid

```json
{
    "access_token": "eyJraWQiOiIxMDZkMzZhNS02OGVlLTQxZGYtOGUzNy1jZTcwMmQ0OTUyZGIiLCJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJtZXNzYWdpbmctY2xpZW50IiwiYXVkIjoibWVzc2FnaW5nLWNsaWVudCIsIm5iZiI6MTYzMzc0NjYwNywic2NvcGUiOlsib3BlbmlkIl0sImlzcyI6Imh0dHA6XC9cL2F1dGgtc2VydmVyOjkzMDIiLCJleHAiOjE2MzM3NDY5MDcsImlhdCI6MTYzMzc0NjYwNywianRpIjoiOTUyMWQ4MGQtMDRkMS00YTljLTlhMzAtZDU5NjM0ZWE1NjFiIn0.q5UYCLmVGjN929B_KPNErv7czIsq51VJxeK8gEqZYNqii4vPWc6s2yJUPo8yZZuDEJkCo-g7NH7wIVsDBpFQpn-TxgpGuASBmEq2kX3P3JLFtbPdBEORVI11FHB6zTiDq10j6vM9e4ugobLLUE67XHAvE-CUw0FJ-oQzqARMVf6RwuT3eb4PbrNWvmncDqL4oii_wbnedFHNnDqz-lmEILpsX1cpaaDwuCTZV9NNA-ZVT5MG-3H-cE_7RpIOdsj4pdb6_-7q25rc0QAChp61R-ObbE44LBckXiA3R-R46ar8sbvBqXsseLebK0oD2DFz2xkDeDCi9XIZYBWspn2Z2Q",
    "scope": "openid",
    "token_type": "Bearer",
    "expires_in": 300
}
```

2. Authorization Request
https://datatracker.ietf.org/doc/html/rfc6749#section-4.1.1


# Resource Server


# Client


# 其他
https://datatracker.ietf.org/doc/html/rfc6749#section-4.4.2

HttpBasic认证

|参数|类型|说明|
| ---- | ---- | ---- |
|**grant_type**|String|必须为：client_credentials|
|scope|String||