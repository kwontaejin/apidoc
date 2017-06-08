## 요약
mapi 문서화를 위한 프로젝트  
오픈소스인 apidoc을 이용해서 구현되었으며, apidoc에 대한 자세한 내용은 [apidoc](apidocjs.com) 사이트를 참조한다.  
node 사용(추가설명)

## 프로세스 흐름
1. git push
2. 등록된 Web Hook에 의해서 젠킨스 빌드
3. 젠킨스에서 최신 소스를 pull
    * pull위치 :
4. apidoc명령 실행
    * apidoc -i /source -t /template -o /result

## 프로젝트 구조
1. source폴더  
API를 생성할 소스 파일이 위치한다. 대부분 해당 폴더에서 작업이 이루어진다.
2. template 폴더  
생성될 API 문서의 템플릿 파일이 위치한다.


## 환경정보
1. gitlab 주소 : [https://xxx.ssgadm.com](https://xxx.ssgadm.com)
2. 젠킨스 주소 : 
3. 도메인 등록 : hosts 파일에 아래 도메인 등록
    * 202.8.173.xxx dev.mapi-doc.ssg.com
4. 개발서버의 git주소 :
5. deploy되는 서버의 주소 :

## 환경설정

1. git설치
    * [https://git-for-windows.github.io/](https://git-for-windows.github.io/)에서 윈도우용 git을 설치한다.
    * git 설치후 이름 및 이메일을 설정한다.
    <pre>
      <code>
          git config --global user.name "john doe"
          git config --global user.email "john@emart.com"
      </code>
    </pre>
2. mapi doc용 git 저장소 만들기
<pre>
  <code>
      git clone https://xxx.xxx.xx
      git remote add origin https://xxx.xxx./git
  </code>
</pre>
3. 원격저장소에 push하면 변경된 내용이 자동으로 서버에 반영된다.