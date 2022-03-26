public class NodeLink {
    protected String data;
    protected NodeLink link;


    public NodeLink() {
        link = null;
        data = "Data Kosong";
    }
            public NodeLink(String d, NodeLink n) {
                data = d;
                link = n;
            }
                    public void setLink(NodeLink n) {
                        link = n;
                    }
                    //  untuk set data
                            public void setData(String d) {
                                data = d;
                            }

                            //  untuk mendapatkan link nextnode
                                    public NodeLink getLink() {
                                        return link;
                                    }
                                    //  untuk mendapatkan data dari node sebelumnya
                                        public String getData() {
                                            return data;
    }

}
