package solved.leetcode.code_march

/**
 *  Problem = 64
 *
 *  *** Design Browser History
 *
 *  # Intuition
 *
 *  # Approach :
 *
 *  # Complexity
 *      - Time complexity: O(?)
 *
 *
 *      - Space complexity: O(?)
 *
 *
 * # Code =>
 */

fun main() {



    val browserHistory = DesignBrowserHistory("jrbilt.com")
    browserHistory.visit("uiza.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")
    println("forward 3 => ${browserHistory.forward(3)} :: ${browserHistory.currPage}")
    println("forward 3 => ${browserHistory.forward(3)} :: ${browserHistory.currPage}")
    browserHistory.visit("fveyl.com")
    browserHistory.visit("hyhqfqf.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")

    println("back 3 => ${browserHistory.back(3)} :: ${browserHistory.currPage}")
    println("back -- => ${browserHistory.currPage != browserHistory.listOfUrls.lastIndex}")
    browserHistory.visit("cccs.com")
    browserHistory.visit("bivz.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")

    println("forward 6 => ${browserHistory.forward(6)} :: ${browserHistory.currPage}")
    println("back 1 => ${browserHistory.back(1)} :: ${browserHistory.currPage}")
    browserHistory.visit("cmbw.com")
    browserHistory.visit("iywwwfn.com")
    browserHistory.visit("sktbhdx.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")

    println("forward 8 => ${browserHistory.forward(8)} :: ${browserHistory.currPage}")
    println("forward 10 => ${browserHistory.forward(10)} :: ${browserHistory.currPage}")
    browserHistory.visit("bskj.com")
    browserHistory.visit("thw.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")

    println("back 6 => ${browserHistory.back(6)} :: ${browserHistory.currPage}")
    browserHistory.visit("hgesj.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")

    println("forward 6 => ${browserHistory.forward(6)} :: ${browserHistory.currPage}")
    browserHistory.visit("ctb.com")
    browserHistory.visit("fllnc.com")
    browserHistory.visit("fs.com")
    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")


    println("back 7 => ${browserHistory.back(7)} :: ${browserHistory.currPage}")

    println("${browserHistory.listOfUrls} :: ${browserHistory.currPage}")


}

class DesignBrowserHistory(homepage: String) {
    val listOfUrls = mutableListOf(homepage)

    var currPage = 0

    fun visit(url: String) {
        if (currPage != listOfUrls.lastIndex) {

            var removeIndex = listOfUrls.lastIndex
            while (removeIndex > currPage) {
                listOfUrls.removeAt(listOfUrls.lastIndex)
                removeIndex--
            }

        }
        listOfUrls.add(url)
        currPage = listOfUrls.lastIndex
    }

    fun back(steps: Int): String {
        val urlIndex = currPage - steps

        return if (urlIndex <= 0) {
            currPage = 0
            listOfUrls[0]
        } else {
            currPage = urlIndex
            listOfUrls[urlIndex]

        }
    }

    fun forward(steps: Int): String {
        val urlIndex = currPage + steps
        return if (urlIndex > listOfUrls.size - 1) {
            currPage = listOfUrls.lastIndex
            listOfUrls.last()
        } else {
            currPage = urlIndex
            listOfUrls[urlIndex]
        }
    }
}