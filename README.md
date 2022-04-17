# SimpleHTTPServer
### 간단한 HTTP 서버
<img width="1501" alt="image" src="https://user-images.githubusercontent.com/40738437/163700526-2bb78c99-d0a2-4edd-a4e6-6c75780aeb1d.png">
간단하게 요청을 받고 요청 메세지를 출력한 뒤, 현재 시간을 응답으로 보내는 HTTP 서버입니다.

### 확인할 내용
1. curl을 사용하면 HTTP 메세지는 정상적으로 나온다.
하지만 크롬브라우저나 포트포워딩으로 삼성 인터넷으로 시도하면 결과가 나오지 않는다.
HTTP 메세지는 전달되지만 정보가 부족해서 파싱이 불가능한건가?
2. "HTTP/1.1 200 OK\r\n\r\n" + today -> \r\n\r\n을 써야만 하는 이유를 모르겠다. \n으로만 끝내고 싶은데 잘 안나온다.
3. 삼성 인터넷으로 요청을 보내면 ??? HTTP/1.1 ??? 이런식으로 나온다. 무엇이 문제일까?
