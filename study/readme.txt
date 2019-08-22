git config --global user.name "username"
git config --global user.email "useremail"

git status
git add
git commit -m "message"
git remote add origin https://github.com/assabug/anbee.git
git push origin -u master

git clone https://github.com/assabug/anbee.git //원격저장소에서 로컬로 (export)

git fetch origin //원격저장소 내용 업데이트(최신이력 확인하여 가져옴)
git pull origin //원격저장소 내용 업데이트(자동 병합/충돌 발생 할 수 있다)