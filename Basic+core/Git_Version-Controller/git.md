git status => to check the status of files.

git init -b main ==> to initialize the git on main branch (.git)
git add >file name> ==> to add the file to staging area.
git add . ==> to add all files in the current directory to staging area.
git commit -m "commit message" ==> to commit the file with a message.
git log ==> to check the commit history.
git branch ==> to check the branch.
git branch -a ==> to check all branches.
git branch -m old_branch new_branch ==> to rename a branch.
git branch -d branch_name ==> to delete a branch.
git checkout branch_name ==> to switch to a branch.
git checkout -b branch_name ==> to create a new branch and switch to it.
git merge branch_name ==> to merge a branch into the current branch.
git remote add origin https://github.com/username/repository.git ==> to add a remote repository.
git remote -v ==> to check the remote repository.


git commit -a -m <commit message> ==> It is used to commit directly from working directory to commit .
git diff ==> It is used to check what the chnages are in the file.

git rm --cached <file_name> ==> It is used to remove the file from staging area but not from the working directory.

git clone <link repo. ...https://github.com...>  ==> It is used to clone the repository from remote repository.

git push -u origin main ==> It is used to push the local repository to remote repository.
git push -f origin main  ==> It is used to force push the local repository to remote repository.

Tagging ------ It Means To create Versions ->
Tagging are two types :- 
1. lightWeight
2. annotated

1. git tag ==> It is used to check the tags.
2. git tag -a v1.0 -m "version 1.0" ==> It is used to create a new tag.
